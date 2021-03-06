package com.vilderlee.search.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/1/22      Create this file
 * </pre>
 */
public class SearchFiles {

    public List searchFile(String indexPath, String field) {
        try {
            //指定索引库的存放地址
            Directory directory = FSDirectory.open(Paths.get(indexPath));
            //指定索引读取器
            IndexReader indexReader = DirectoryReader.open(directory);
            //指定索引搜索器
            IndexSearcher indexSearcher = new IndexSearcher(indexReader);
            //实例化分析器
            Analyzer analyzer = new StandardAnalyzer();

            //使用MatchAllDocsQuery查询索引目录中的所有文档
            Query query = new MatchAllDocsQuery();
            //第一个参数是查询对象，第二个参数是查询结果返回的最大值
            TopDocs topDocs = indexSearcher.search(query, 10);
            int i = 0;
            List list = new ArrayList<FileText>();

            for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
                //scoreDoc.doc属性就是document对象的id
                //int doc = scoreDoc.doc;
                //根据document的id找到document对象
                Document document = indexSearcher.doc(scoreDoc.doc);
                //文件名称
                String fileName = document.get("fileName");
                System.out.println(fileName);
                //文件大小
                String fileSize = document.get("fileSize");
                System.out.println(fileSize);
                //文件路径
                String filePath = document.get("filePath");
                System.out.println(filePath);
                System.out.println("----------------------------------");

                if (fileName.indexOf(field) != -1) {
                    list.add(new FileText(fileName,fileSize,filePath));
                }
                System.out.println(++i);
            }

            indexReader.close();
            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        SearchFiles searchFiles = new SearchFiles();
        List list = searchFiles.searchFile("E:\\index\\", "Redis");
        list.forEach(o->{
            System.out.println(o.toString());
        });
    }
}

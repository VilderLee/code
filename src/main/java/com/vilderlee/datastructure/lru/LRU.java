package com.vilderlee.datastructure.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/5/29      Create this file
 * </pre>
 */
public class LRU<K,V> extends LinkedHashMap<K,V>{

    public LRU(int initialCapacity) {
        /**
         * 初始容量
         * 负载因子
         * true 为访问顺序
         * false 为插入顺序
         */
        super(16, (float) 0.75, true);
        this.initialCapacity = initialCapacity;
    }

    //最大容量
    private int initialCapacity;


    @Override protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size() > initialCapacity;
    }


    public static void main(String[] args) {
        LRU<String,Object> lru = new LRU<>(3);
        lru.put("VilderLee", "momo");
        lru.put("wang", "momo");
        lru.put("lee", "momo");

        lru.put("li", "123");
        System.out.println("Before----");
        lru.forEach((K,V)->{
            System.out.println(K + " ," + V);
        });

        System.out.println("After----");
        lru.get("wang");
        lru.forEach((K,V)->{
            System.out.println(K + " ," + V);
        });
    }
}

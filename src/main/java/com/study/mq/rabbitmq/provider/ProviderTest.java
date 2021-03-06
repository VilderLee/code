package com.study.mq.rabbitmq.provider;

import com.study.mq.rabbitmq.connect.RabbitMQConnectFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/1/14      Create this file
 * </pre>
 */
public class ProviderTest {

    public static void main(String[] args) throws Exception {
        RabbitMQConnectFactory rabbitMQConnectFactory = new RabbitMQConnectFactory();
        rabbitMQConnectFactory.connect();
        int i = 0;
        while (i < 3) {
            User user = new User();
            user.setAge(i);
            user.setUserName("lichao" + i);
            rabbitMQConnectFactory.send(user);
            i++;
        }
        TimeUnit.SECONDS.sleep(2);
//        rabbitMQConnectFactory.close();

        Map map = new HashMap(16);
        map.put(1, "1");

        try {
            map.forEach((k,v)->{
                map.remove(k);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("xixixi");
    }
}

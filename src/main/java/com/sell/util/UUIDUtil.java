package com.sell.util;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Buguoliang on 2018/3/27.
 */
public class UUIDUtil {

    private static AtomicInteger count = new AtomicInteger(0);

    public static String genUniqueId() {
        if(count.get() > 9999) {
            count.set(1);
        }
        int num = count.incrementAndGet();
        long time = System.currentTimeMillis() * 1000;
        return String.valueOf(time + num);
    }

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer i = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() * 100000 + String.valueOf(i);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.println(genUniqueId());
        }

    }
}

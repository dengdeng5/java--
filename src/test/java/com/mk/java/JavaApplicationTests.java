package com.mk.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class JavaApplicationTests {

    @Test
    void contextLoads() {


        System.out.println("222222");
    }



    @Test
    void  min(){
        int max = 0;
        int min = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int num=0;
        for (int i = 0; i <= 100; i++) {
            Random rand = new Random();
            int r = rand.nextInt(99);
            if (r >= max) {
                max = r;
            }
            if (r< min){
                min = r;
            }
            if (r > 50) {
                atomicInteger.addAndGet(1);
            }
        }
        System.out.println("最大数max=" + max + "\n" + "最小数min=" + min);
        System.out.println("大于50的个数："+atomicInteger);

    }

}

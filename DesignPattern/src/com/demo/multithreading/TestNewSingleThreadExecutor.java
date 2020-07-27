package com.demo.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述:创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 * @author zhangrq
 * @version V1.0
 * @Title: TestNewSingleThreadExecutor
 * @Package com.demo.multithreading
 * @Description:
 * @date 2020-07-27 10:36
 */
public class TestNewSingleThreadExecutor {
     public static void main(String[] args) {
         ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
         for (int i = 1; i <= 10; i++) {
             final int index = i;
             singleThreadExecutor.execute(new Runnable() {

                 @Override
                 public void run() {
                     try {
                         String threadName = Thread.currentThread().getName();
                         System.out.println("执行：" + index + "，线程名称：" + threadName);
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             });
         }
     }
}

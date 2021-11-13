package cn.yzd3008.java.javase;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws InterruptedException {

        log.info("=== ThreadPoolExecutor demo");

        AtomicInteger ai = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        do {
            executorService.submit(new MyTask(String.valueOf(ai.getAndIncrement())));
        } while (true);
    }
}

package cn.yzd3008.java.javase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
@Getter
@Setter
@AllArgsConstructor
public class MyTask implements Runnable {

    private String taskId;

    @Override
    public void run() {

        log.info("=== Start: MyTask#run()");

        log.info("=== Doing some real task with provided data: {{}}", taskId);
        try {
            Thread.sleep((int)Math.random() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("=== End: MyTask#run()");
    }
}

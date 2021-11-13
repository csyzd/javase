package cn.yzd3008.java.javase;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;


@Slf4j
public class HashMapDemo {

    public static void main(String[] args) {

        new HashMap(4);
        Map<String, String> map = new HashMap<>();

        // put
        log.info("=== put demo");
        int N = 10000;
        int i = 0;
        while (i <= N) {
            i++;
            map.put(String.valueOf(i), String.valueOf(i));
        }

        log.info("=== end put demo");
    }


}

package com.xiaoyu;


import org.apache.log4j.Logger;

/**
 * @author ：luoyÅu
 * @version ：1.0
 * @date ： 2021/7/17 1:09 上午
 * @description
 */

public class Main {
    static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("log4j demo");

        long l = 0;
        if (l == 0){
            LOGGER.info("l == 0");
        }
    }
}

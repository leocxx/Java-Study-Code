package com.chen.log4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jTest1 {


    //获取日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4jTest1.class);



    public static void main(String[] args) {


        LOGGER.debug("debug级别的日志");
        LOGGER.info("info级别的日志");
        LOGGER.warn("warn级别的日志");
        LOGGER.error("error级别的日志");
    }
}

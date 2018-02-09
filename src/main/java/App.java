package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  App {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        LoggerByType logger = (LoggerByType)context.getBean("logger");
        logger.writeConsole("Hello there from autowiring by Type");
        logger.writeFile("Hi again");

        LoggerByName logger1 = (LoggerByName)context.getBean("logger1");
        logger1.writeConsole("Hello there from autowiring by Name");
        logger1.writeFile("Hi again to you");

        LoggerByConstructor logger2 =(LoggerByConstructor)context.getBean("logger2");
        logger2.writeConsole("Hello there from autowiring by constructor");
        logger2.writeConsole("Hi again :))");
        ((ClassPathXmlApplicationContext)context).close();


    }
}
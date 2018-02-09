package main.java;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

    @Override
    public void write(String text){
        System.out.println(text);
    }
}

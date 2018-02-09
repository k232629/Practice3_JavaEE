package main.java;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LoggerByType {

    @Autowired
    @Qualifier("main")
    private ConsoleWriter consoleWriter;
    @NotNull
    private FileWriter fileWriter;

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }
    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}

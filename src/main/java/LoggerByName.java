package main.java;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LoggerByName {

    @Autowired
    @Qualifier("main")
    private LogWriter consoleWriter;
    @NotNull
    private LogWriter fileWriter;

    public LogWriter getConsoleWriter() {
        return consoleWriter;
    }
    @Autowired
    public void setConsoleWriter(LogWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public LogWriter getFileWriter() {
        return fileWriter;
    }
    @Autowired
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}

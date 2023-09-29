package pack;

import java.io.FileWriter;

public class LoggingSingleton {
    private static LoggingSingleton log;
    private int MessageNumber;
    private FileWriter writeInFile;

    private LoggingSingleton() {
        try {
            writeInFile = new FileWriter("Log.txt");
            writeInFile.write("Log has started\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static LoggingSingleton getLog() {
        if (log == null) {
            log = new LoggingSingleton();
        }
        return log;
    }

    public void setMessage(String message) {
        try {
            writeInFile.write(message + '\n');
            MessageNumber++;
            System.out.println(MessageNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void stopLogging() {
        try {
            writeInFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

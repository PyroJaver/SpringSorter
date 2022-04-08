package loggers;

import java.util.Date;

public class TxtLogger extends Logger {
    @Override
    public void addToLog() {
   System.out.println(getNameOfSort());
    }
}

package logging;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Logger {
    void setLengthOfArray(int lengthOfArray);
    void addToLog() throws IOException;
}

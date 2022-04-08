package inputOutput.Input;

import java.io.FileNotFoundException;

public interface Input {
    int[] toInput() throws NumberFormatException, FileNotFoundException;
}

package inputOutput.Input;

import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Input {
    int[] toInput() throws NumberFormatException, FileNotFoundException;
}

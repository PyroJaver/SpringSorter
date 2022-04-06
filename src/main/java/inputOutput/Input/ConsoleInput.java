package inputOutput.Input;

import inputOutput.splitters.Splitter;
import inputOutput.splitters.StrictSplitter;

import java.util.Scanner;

public class ConsoleInput implements Input {

    @Override
    public int[] toInput() {
        Scanner scannedArray = new Scanner(System.in);
        System.out.println("Введите числа, разделяя их пробелом");
        Splitter splitter = new StrictSplitter();
        return splitter.toSplit(scannedArray);
    }
}

package inputOutput.Input;
import inputOutput.splitters.Splitter;
import inputOutput.splitters.StrictSplitter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TxtInput implements Input {
    @Override
    public int[] toInput() throws NumberFormatException, FileNotFoundException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        File input = context.getBean("inputFile", File.class);
        Scanner scannedArray = new Scanner(input);
        Splitter splitter = new StrictSplitter();
        splitter.toSplit(scannedArray);
       return splitter.toSplit(scannedArray);
    }
}

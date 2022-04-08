package inputOutput.Input;
import inputOutput.splitters.Splitter;
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
        String stringArray = null;
        StringBuilder stringBuilder = new StringBuilder();
        while (scannedArray.hasNextLine()) {
            stringArray = stringBuilder.append(scannedArray.nextLine()).toString();
        }
        Splitter splitter = context.getBean("split", Splitter.class);
       return splitter.toSplit(stringArray);
    }
}

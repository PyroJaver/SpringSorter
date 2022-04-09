package inputOutput.Input;
import inputOutput.splitter.toSplit;
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
        toSplit splitter = context.getBean("split", toSplit.class);
       return splitter.toSplit(stringArray);
    }
}

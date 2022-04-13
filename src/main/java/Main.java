import inputOutput.Input.Input;
import inputOutput.output.CountToNextLine;
import inputOutput.output.Output;
import logging.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sorts.Sorter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Input input = context.getBean("input", Input.class);
        Sorter sorter = context.getBean("sorter", Sorter.class);
        Output output = context.getBean("output", Output.class);
        CountToNextLine count = context.getBean("countToNextLine", CountToNextLine.class);
        int[] unsortedArray = input.toInput();
        int[] sortedArray = sorter.toSort(unsortedArray);
        output.toOutput(sortedArray, count.getCountToNextLine());
        Logger logger = context.getBean("logger", Logger.class);
        logger.setLengthOfArray(sortedArray.length);
        logger.addToLog();
        context.close();
    }
}



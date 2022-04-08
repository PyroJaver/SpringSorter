import inputOutput.Input.Input;
import inputOutput.output.Output;
import loggers.Logger;
import loggers.TxtLogger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sorts.Sorter;

import java.io.FileNotFoundException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
   //     Date date = new Date();
        TxtLogger logger = new TxtLogger();
    //    logger.setBeginningOfSort(date.toString());
        Input input = context.getBean("input", Input.class);
    //    logger.setTypeOfInput(input.getClass().toString());
        Sorter sorter = context.getBean("sorter", Sorter.class);
    //    logger.setNameOfSort(sorter.getClass().toString());
        int[] sortedArray = sorter.toSort(input.toInput());
        Output output = context.getBean("output", Output.class);
        output.toOutput(sortedArray);
    //    logger.addToLog();
        context.close();
    }
}



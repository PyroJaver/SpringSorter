import inputOutput.Input.Input;
import inputOutput.output.Output;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sorts.Sorter;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Input input = context.getBean("input", Input.class);
        Sorter sorter = context.getBean("sorter", Sorter.class);
        int[] sortedArray = sorter.toSort(input.toInput());
        Output output = context.getBean("output", Output.class);
        output.toOutput(sortedArray);
        context.close();
    }
}



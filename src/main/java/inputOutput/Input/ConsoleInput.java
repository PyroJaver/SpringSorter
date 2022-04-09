package inputOutput.Input;

import inputOutput.splitter.toSplit;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ConsoleInput implements Input {

    @Override
    public int[] toInput() {
        Scanner scannedArray = new Scanner(System.in);
        System.out.println("Введите числа, разделяя их пробелом");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.refresh();
        toSplit splitter = context.getBean("split", toSplit.class);
        return splitter.toSplit(scannedArray.nextLine());
    }
}

package inputOutput.Input;

import inputOutput.splitters.Splitter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class ConsoleInput implements Input {

    @Override
    public int[] toInput() {
        Scanner scannedArray = new Scanner(System.in);
        System.out.println("Введите числа, разделяя их пробелом");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.refresh();
        Splitter splitter = context.getBean("split", Splitter.class);
        return splitter.toSplit(scannedArray.nextLine());
    }
}

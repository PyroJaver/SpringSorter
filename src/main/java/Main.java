import org.springframework.context.support.ClassPathXmlApplicationContext;
import sorts.Sorter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Введите числа, разделяя их пробелом");
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        Sorter sorter = context.getBean("sorter", Sorter.class);
        int [] array2 = sorter.toSort(array);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
            context.close();
        }
    }
    }


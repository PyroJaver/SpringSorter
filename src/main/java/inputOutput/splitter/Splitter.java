package inputOutput.splitter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Splitter implements toSplit {
//"\\s+"

    @Override
    public int[] toSplit(String stringArray) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         RegexArg regexArg = context.getBean("regexArg", RegexArg.class);
        int[] unsortedArray = new int[0];
        try {
            unsortedArray = Arrays.stream(stringArray
                            .split(regexArg.getRegexArg())).filter(number -> number != null)
                       .mapToInt(Integer::parseInt)
                    .toArray();

        } catch (NumberFormatException e) {
            System.out.println("Введённый массив имеет неправильный формат");
        }
        return unsortedArray;
    }
}

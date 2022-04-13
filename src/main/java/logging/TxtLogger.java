package logging;

import inputOutput.Input.Input;
import inputOutput.output.Output;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sorts.Sorter;

import java.io.*;


public class TxtLogger extends AbstractLogger{
    public TxtLogger() {
    }

    public TxtLogger(Sorter typeOfSort, Input typeOfInput, Output typeOfOutput, int lengthOfArray) {
        super(typeOfSort, typeOfInput, typeOfOutput, lengthOfArray);
    }

    @Override
    public void addToLog() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PrintWriter logWriter = new PrintWriter(
                 new FileWriter(context.getBean("logFile", File.class), true));

        SpaceGenerator spGen = new SpaceGenerator();
        String typeOfSortString = getTypeOfSort().getClass().getSimpleName();
        String typeOfInputString = getTypeOfInput().getClass().getSimpleName();
        String typeOfOutputString = getTypeOfOutput().getClass().getSimpleName();
        logWriter.write(typeOfSortString + spGen.generateSpace(typeOfSortString));
        logWriter.write(typeOfInputString + spGen.generateSpace(typeOfInputString));
        logWriter.write(typeOfOutputString + spGen.generateSpace(typeOfOutputString));
        logWriter.print(getLengthOfArray());
        logWriter.append('\n');
   logWriter.close();
     System.out.println(getLengthOfArray());
    }
}

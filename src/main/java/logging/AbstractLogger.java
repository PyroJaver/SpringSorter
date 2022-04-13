package logging;

import inputOutput.Input.Input;
import inputOutput.output.Output;
import sorts.Sorter;

import java.util.Arrays;

public abstract class AbstractLogger implements Logger {
    private Sorter typeOfSort;
    private Input typeOfInput;
    private Output typeOfOutput;
    private int lengthOfArray;

  /*  public String getClassName(Object obj){
    String[] classNameArr = (String[]) Arrays.stream(obj.getClass().getName()
                    .split("."))
            .toArray();
    String className = classNameArr[classNameArr.length-1];
        return className;
    }*/

    public AbstractLogger() {
    }

    public AbstractLogger(Sorter typeOfSort, Input typeOfInput, Output typeOfOutput, int lengthOfArray) {
        this.typeOfSort = typeOfSort;
        this.typeOfInput = typeOfInput;
        this.typeOfOutput = typeOfOutput;
        this.lengthOfArray = lengthOfArray;
    }

    public Sorter getTypeOfSort() {
        return typeOfSort;
    }

    public void setTypeOfSort(Sorter typeOfSort) {
        this.typeOfSort = typeOfSort;
    }

    public Input getTypeOfInput() {
        return typeOfInput;
    }

    public void setTypeOfInput(Input typeOfInput) {
        this.typeOfInput = typeOfInput;
    }

    public Output getTypeOfOutput() {
        return typeOfOutput;
    }

    public void setTypeOfOutput(Output typeOfOutput) {
        this.typeOfOutput = typeOfOutput;
    }

    public int getLengthOfArray() {
        return lengthOfArray;
    }

    public void setLengthOfArray(int lengthOfArray) {
        this.lengthOfArray = lengthOfArray;
    }


}

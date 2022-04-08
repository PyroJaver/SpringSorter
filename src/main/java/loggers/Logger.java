package loggers;

import java.util.Date;

public abstract class Logger {
    public String getTypeOfInput() {
        return typeOfInput;
    }

    public void setTypeOfInput(String typeOfInput) {
        this.typeOfInput = typeOfInput;
    }

 //   public void setBeginningOfSort(String beginningOfSort) {
 //       this.beginningOfSort = beginningOfSort;
 //   }

    private String typeOfInput;
    private String nameOfSort;
    private String nameOfSplitter;
    private String beginningOfSort;
    private Long endingOfSort;
    public String getNameOfSort() {
        return nameOfSort;
    }

    public void setNameOfSort(String nameOfSort) {
        this.nameOfSort = nameOfSort;
    }

    public String getNameOfSplitter() {
        return nameOfSplitter;
    }

    public void setNameOfSplitter(String nameOfSplitter) {
        this.nameOfSplitter = nameOfSplitter;
    }

    public String getBeginningOfSort() {
        return beginningOfSort;
    }

    public void setBeginningOfSort(String beginningOfSort) {
        this.beginningOfSort = beginningOfSort;
    }

    public Long getEndingOfSort() {
        return endingOfSort;
    }

    public void setEndingOfSort(Long endingOfSort) {
        this.endingOfSort = endingOfSort;
    }
     abstract void addToLog();
}

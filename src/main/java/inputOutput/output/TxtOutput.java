package inputOutput.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TxtOutput implements Output{

    @Override
    public void toOutput(int[] array, int count) throws FileNotFoundException {
        File outputFile = new File("C:\\Users\\kekec\\Desktop\\file1.txt");
        PrintWriter pw = new PrintWriter(outputFile);
        for (int i = 0; i < array.length; i++){
            pw.print(array[i] + " ") ;
            if (i % count == 0 && i != 0){
                pw.println();
            }

        }
        System.out.println("Массив успешно отсротирован и записан в файл");
        pw.close();
    }
}

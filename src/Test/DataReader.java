package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) throws IOException {
        String text;
        String a = null;

        try {
            FileReader fileReader = new FileReader("//Users/billal/Desktop/Test/src/textFile");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((text = bufferedReader.readLine()) != null) {
                a = text;

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }

}





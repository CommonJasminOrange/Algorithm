package javaSE.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用throws声明异常
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;

        reader = new FileReader("g:\\1dzy\\b.txt");

        char c1 = (char) reader.read();
        System.out.println(c1);



        if (reader != null) {
            reader.close();
        }
    }
}

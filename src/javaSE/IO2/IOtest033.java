package javaSE.IO2;

import java.io.*;

public class IOtest033 {
    public static void main(String[] args) {
        copy("a.txt","b.txt");
    }

    public static void copy(String srcFile, String destFile) {
        File src = new File(srcFile);
        File dest = new File(destFile);

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] dates = new byte[1024];
            int len = -1;
            while ((len = is.read(dates)) != -1) {
                os.write(dates, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

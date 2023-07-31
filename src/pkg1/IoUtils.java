package pkg1;

import java.io.*;

public class IoUtils {
    static void copy(InputStream src, OutputStream dest) throws IOException {
        int value;
        while((value= src.read())!= -1){
            dest.write(value);
        }
    }

    static void copyFile(String src, String dest) throws IOException {
        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);
        copy(fin,fout);

        fin.close();
        fout.close();
    }
}

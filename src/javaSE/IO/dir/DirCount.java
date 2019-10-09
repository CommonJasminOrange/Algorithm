package javaSE.IO.dir;

import java.io.File;

/**
 * 使用面向对象 统计文件夹大小
 *
 *
 */

public class DirCount {

    private long len;

    private  String path;

    private File src;

    private int fileSize = -1;

    private int dirSize = -1;

    public long getLen() {
        return len;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }

    public DirCount(String path){
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }

    public static void main(String[] args) {
        DirCount dir = new DirCount("G:/Algorithm/src/javaSE");
        DirCount dir2 = new DirCount("G:/Algorithm/src");
        System.out.println(dir.getLen()+"-->"+dir.getFileSize()+"-->"+dir.getDirSize());
        System.out.println(dir2.getLen()+"-->"+dir2.getFileSize()+"-->"+dir2.getDirSize());


    }
    private void count(File src){
        if (src != null || src.exists()){
            if (src.isFile()){
                len += src.length();
                this.fileSize++;
            } else {
                this.dirSize++;
                for (File temp:src.listFiles()){
                    count(temp);
                }
            }
        }
    }
}
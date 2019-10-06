package javaSE.CommonClass;

import java.io.File;
import java.io.IOException;


public class TestFile {

    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));
//
//        File f2 = new File("gg.txt");
//        f2.createNewFile();
//
//        System.out.println("File是否存在："+ f2.exists());
//        System.out.println("File是否是目录："+ f2.isDirectory());
//        System.out.println("File是否是文件："+ f2.isFile());
//        System.out.println("File最后修改时间："+ new Date(f2.lastModified()));
//        System.out.println("File的大小："+ f2.length());
//        System.out.println("File的文件名："+ f2.getName());
//        System.out.println("File的目录路径："+ f2.getPath());

        File file = new File("gg.txt");
        //判断该文件是否存在
        boolean flag = file.exists();
        //如果存在就删除 不存在就创建
        if (flag){
            boolean flagd = file.delete();
            if (flagd){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败!");
            }
        }else {
            //创建
            boolean flagn = true;
            try {
                File dir = file.getParentFile();
                dir.mkdirs();
                //创建文件
                flagn = file.createNewFile();
                System.out.println("创建成功！");
            } catch (IOException e){
                System.out.println("创建失败！");
                e.printStackTrace();
            }
        }

        //文件重命名
        //file.renameTo(new File("g:/1dzy/readme.txt"));

    }
}

package cn.light;

import java.io.*;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        cutFile();
    }
    public static void cutFile() throws IOException {
        File file = new File("src/png/tupian.png");
        File dir = new File("src/png");
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] buf = new byte[1024*1024];
        int length = 0;
        for(int i=0;(length=fileInputStream.read(buf))!=-1;i++){
            FileOutputStream fileout = new FileOutputStream((new File(dir,"part"+i+".png")));
            fileout.write(buf,0,length);
            fileout.close();
        }
        fileInputStream.close();
    }
}

import java.io.*;

public class FileUtil {
    public static void writeBytes(String fileName,byte[]data)throws Exception{
        FileOutputStream fos=new FileOutputStream(fileName);
        fos.write(data);
        fos.flush();
        fos.close();
        System.out.println("Done");
    }
    public static byte[] readByte(String fileName)throws Exception{
        File file=new File(fileName);
        try (FileInputStream fileInputStream=new FileInputStream(file);){
            byte[] bytesArray=new byte[(int)file.length()];
            fileInputStream.read(bytesArray);
            return bytesArray;
        }

    }
}

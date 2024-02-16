import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost",6789);
        OutputStream outputStream=socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        byte[]bytes=FileUtil.readByte("C:\\Users\\Admin\\Desktop\\java.png");


        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();

    }
}

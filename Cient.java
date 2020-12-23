import java.io.*;
import java.net.*;
public class Cient {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost",6666);
        DataInputStream din=new DataInputStream(s.getInputStream());
        String str=din.readUTF();
        System.out.println("The Server has sent the following string:" + str);
        s.close();
        
    }
    
}

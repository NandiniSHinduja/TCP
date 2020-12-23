import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        System.out.println("Server is online.");
        String str="hello everybody!";
        dout.writeUTF(str);
        ss.close();
        s.close();
        
        
    }
    
}

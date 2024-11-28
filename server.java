import java.net.*;
import java.io.*;
public class server {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(666);
			System.out.println("waiting for client....");
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("Message: "+str);
			ss.close();
			
		}catch(Exception e) {
			System.out.println(e);		}
		// TODO Auto-generated method stub

	}

}

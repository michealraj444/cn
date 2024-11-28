import java.io.DataOutputStream;
import java.net.Socket;


public class client {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost",666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello world");
			dout.writeUTF("world");
			dout.flush();
			dout.close();
			s.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}

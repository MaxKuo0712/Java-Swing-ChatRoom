package tw.Max.RunCode;

import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ChatRoomClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("192.168.0.7"), 7777);
			BufferedOutputStream bout = new BufferedOutputStream(socket.getOutputStream());
			bout.write("Hello, 嗨".getBytes());
			bout.close();
			socket.close();
			System.out.println("ClientA OK. --> " + socket.getPort());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

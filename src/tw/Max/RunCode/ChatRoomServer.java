package tw.Max.RunCode;

import java.io.BufferedInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatRoomServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket =  server.accept(); // 等待處 放入socket
			
			String host = socket.getInetAddress().getHostAddress();
			System.out.println(host);
			
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream()); // 取得輸入串流
			
			byte[] buf = new byte[4096];
			int len;
			while((len = bin.read(buf)) != -1) {
				System.out.print(new String(buf, 0, len));
			}
			
			bin.close();
			server.close();
			System.out.println("ServerA OK.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

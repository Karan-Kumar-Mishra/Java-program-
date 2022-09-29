import java.net.*;
public class recive {
	public static void main(String args[]) throws Exception {

		byte b[] = new byte[10000];
		DatagramPacket p = new DatagramPacket(b, b.length);
		DatagramSocket socket = new DatagramSocket(5555);
		System.out.println("wating for packet.....");
		while (true) {
			socket.receive(p);
			System.out.println(new String(b));
			for (int i = 0; i < b.length; i++) {
				b[i] = 0;
			}
		}
  }
}

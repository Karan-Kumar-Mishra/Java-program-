import java.net.*;
import java.io.*;
class chat extends Thread
{
	 
	 synchronized public void send() throws Exception
	{
		System.out.println("chating is on....");
 while(true)
 {
 			
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

String content=br.readLine();
DatagramPacket packet=new DatagramPacket(content.getBytes(),content.getBytes().length,InetAddress.getLocalHost(),8888);
DatagramSocket socket= new 	DatagramSocket();
socket.send(packet);
 }

	}
	 synchronized public void receive() throws Exception
	{
			byte b[]= new byte[10000];
		DatagramPacket p= new DatagramPacket(b,b.length);
		DatagramSocket socket= new DatagramSocket(5555);
	
		while(true)
		{
		socket.receive(p);
		System.out.print("karan >>  ");
   		System.out.println( new String (b));
		for(int i=0;i<b.length;i++)
		{
			b[i]=0;
		}
		}
	}
}
class A extends Thread
{
	   chat c1= new chat(); 
	 public void run() 
	 {
	 	try{
	 		
	 c1.send();
	 }
	 catch( Exception ex)
	 {
	 	
	 	} 	
	 }
}
class B extends Thread
{
	 chat c1= new chat(); 
	 public void run()
	 {
	  try
	  {
	  c1.receive();
	  }
	  catch( Exception ex)
	  {
	 	
	  }	
	 }
}  
public class send {
	public static void main(String[] args) throws Exception
	 {
	
  A send = new A();
  B recive= new B();
  send.start();
  recive.start(); 
  }
}

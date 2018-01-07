import java.net.*;
import java.io.*;

public class UDPClient {
	public static void main(String[] args) {
		
		byte sendBytes[]	= new byte[1024];
		byte receiveBytes[] = new byte[1024];
		
		String messageString;
		try {
			DatagramSocket clientSocket = new DatagramSocket();	
			DatagramPacket sendPacket;
			DatagramPacket receivePacket;
		
			BufferedReader ipReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter message : ");
			messageString = ipReader.readLine();
			sendBytes 	  = messageString.getBytes();
			sendPacket 	  = new DatagramPacket(sendBytes, sendBytes.length, InetAddress.getByName("localhost"), 9876);
			clientSocket.send(sendPacket);
			
			receivePacket = new DatagramPacket(receiveBytes, receiveBytes.length);
			clientSocket.receive(receivePacket);
			System.out.println(new String(receivePacket.getData()));
			
				
		}
		catch(Exception e) {
			System.out.println(e);		
		}	
	}
}

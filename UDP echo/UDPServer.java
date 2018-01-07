import java.net.*;
import java.io.*;


public class UDPServer {

	public static void main(String[] args) {
		
		byte sendBytes[] 			= new byte[1024];
		byte receiveBytes[] 		= new byte[1024];

		String messageString;

		try{
			DatagramSocket serverSocket = new DatagramSocket(9876);
			DatagramPacket serverPacket = new DatagramPacket(receiveBytes, receiveBytes.length);
			DatagramPacket echoPacket;

			InetAddress ipAddress;

			serverSocket.receive(serverPacket);
			messageString = new String(serverPacket.getData());
			System.out.println("From client : " + messageString);

			ipAddress  = serverPacket.getAddress();
			sendBytes  = messageString.getBytes();
			echoPacket = new DatagramPacket(sendBytes, sendBytes.length, ipAddress, serverPacket.getPort());
			serverSocket.send(echoPacket);							
		}
		catch(Exception e) {
			System.out.println(e);		
		}
		
	}

}

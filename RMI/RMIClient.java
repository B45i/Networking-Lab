import java.rmi.*;
import java.io.*;

public class RMIClient{
	public static void main(String args[]) throws RemoteException{
		try{
			RMIInterface intf = (RMIInterface)Naming.lookup("rmi://localhost/calc");
			System.out.println(intf.calc(10, 15));
		}
		catch(Exception e) {
			System.out.println(e);		
		}
	}
}

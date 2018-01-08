import java.rmi.*;
import java.rmi.server.*;

public class RMIImplementation extends UnicastRemoteObject implements RMIInterface{
	public RMIImplementation() throws RemoteException {}
	 public int calc(int a, int b) {
		return a+b;	
	}
}

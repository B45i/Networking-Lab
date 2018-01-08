import java.net.*;
import java.rmi.*;

public class RMIServer{
	public static void main(String args[]) {
	
		try{	
			RMIImplementation rmimpl = new RMIImplementation();
			Naming.rebind("calc", rmimpl);
		}
		catch(Exception e) {
			System.out.println(e);		
		}
		
	}
}

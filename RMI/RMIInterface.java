import java.rmi.*;

public interface RMIInterface extends Remote {
	int calc(int a, int b) throws RemoteException;
}

package abstractDemoLive;

import java.rmi.RemoteException;

public interface ICustomerServices {
		
	void save(Customer customer) throws RemoteException;
}

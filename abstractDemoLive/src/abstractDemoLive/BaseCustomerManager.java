package abstractDemoLive;

import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerServices{

	@Override
	public void save(Customer customer) throws RemoteException {
		System.out.println("Saved to database" + customer.getFirstName());
	}

}

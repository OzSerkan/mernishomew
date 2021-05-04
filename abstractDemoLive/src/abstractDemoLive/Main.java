package abstractDemoLive;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	
	public static void main(String[] args) throws RemoteException{
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Serkan Eren");
		customer.setLastName("Özarslan");
		customer.setNationalId(70456103310L);
		customer.setDateOfBirth(2004);

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MersisService());
		customerManager.save(customer);
		
	}

	
	
	
	

}

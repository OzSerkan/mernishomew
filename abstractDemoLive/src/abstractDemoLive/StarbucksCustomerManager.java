package abstractDemoLive;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;
	


	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}



	public void save(Customer customer) throws RemoteException {
		
		if(customerCheckService.CheckIfRealPerson(customer)){
			this.save(customer);
		}
		else {
			System.out.println("Not a valid User");
		}
	}

	
}

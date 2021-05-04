package abstractDemoLive;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersisService implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		return kpsPublic.TCKimlikNoDogrula(customer.getNationalId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
	}
	
	
	

}

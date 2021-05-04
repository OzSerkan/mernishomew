package abstractDemoLive;

public class Customer implements IEntity{
	
	private int id;
	private String FirstName;
	private String LastName;
	private int DateOfBirth;
	private long NationalId;
	
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public long getNationalId() {
		return NationalId;
	}

	public void setNationalId(long nationalId) {
		NationalId = nationalId;
	}

}

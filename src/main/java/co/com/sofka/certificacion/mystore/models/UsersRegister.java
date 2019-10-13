package co.com.sofka.certificacion.mystore.models;

public class UsersRegister {

	private String title;
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private String year;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String mobilePhone;
	private String addressReference;
	private String company;
	public UsersRegister(String title, String firstName, String lastName, int day, int month, int year, String company, String address,
			String city, String state, String postalCode, String country, String mobilePhone, String addressReference){
		
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = Integer.toString(year);
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.mobilePhone = mobilePhone;
		this.addressReference = addressReference;
		this.company = company;
	}
	
	public String getTitle() {
		return title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public String getYear() {
		return year;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getAddressReference() {
		return addressReference;
	}
	
	public String getCompany() {
		return company;
	}
}

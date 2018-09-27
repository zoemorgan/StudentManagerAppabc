package ie.gmit.studentmanager;

public class Address {
	// house num, street, county, eircode
	private int streetNum;
	private String street;
	private String town;

	// name setter & getter
	public int getStreetNum() {
		return streetNum;
	}

	public void setName(int streetNum) {
		this.streetNum = streetNum;
	}

	// street setter & getter
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	// town setter & getter
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

}

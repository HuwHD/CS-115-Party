import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Profile {

	private String name;
	private Date dob;
	private String townOfResidence;
	private String countryOfResidence;
	private String nationality;
	private String[] interests;
	private List<Profile> friends = new ArrayList<Profile>();
	
	public Profile(String name, Date dob, String townOfResidence, String countryOfResidence, String nationality, String[] interests) {
		
		this.name = name;
		this.dob = dob;
		this.townOfResidence = townOfResidence;
		this.countryOfResidence = countryOfResidence;
		this.nationality = nationality;
		this.interests = interests;
				
	}

	public void addFriend(Profile newFriend) {
		friends.add(newFriend);
	}
	
	public Profile getFriend(int i) {
		return friends.get(i);
	}
	
	public int numOfFriends() {
		return friends.size();
	}
	 
	public String toString() {
		String allInterests = "";
		
		for (int i = 0 ; i < getInterests().length - 1; i++) {
			allInterests = allInterests + getInterests()[i] + " , ";		
		}
		allInterests = allInterests + getInterests()[getInterests().length - 1];
		
		return ("name: " + getName() + "\ndob: " + getDateOfBirth() + "\ntownOfResidence: " + getTownOfResidence() + "\ncountryOfResidence: " + getCountryOfResidence() + "\nnationality: " + getNationality() + "\ninterests: " + allInterests);
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}
	
	public String getDateOfBirth(){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(dob);
			
	}

	public String getTownOfResidence() {
		return townOfResidence;
	}


	public void setTownOfResidence(String townOfResidence) {
		this.townOfResidence = townOfResidence;
	}



	public String getCountryOfResidence() {
		return countryOfResidence;
	}



	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public String[] getInterests() {
		return interests;
	}
	



	public void setInterests(String[] interests) {
		this.interests = interests;
	}
}
	


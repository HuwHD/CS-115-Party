import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;


/**
 * Test Class for Profile
 * @author Huw
 *
 */
public class ProfileMain {

	private static final String[] tempInterests = {"Food" , "Golf" , "Chess"};	
	
	public static void main(String[] args) { 
		
		Date jimDate = new Date();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dFormated  = formatter.format(jimDate);
		
		Profile jim = new Profile("Jim", jimDate, "Splot", "Wales", "Welsh", new String[] {"Sport", "Food"});
		Profile simoth = new Profile("Simoth", new Date(), "Roath", "Wales", "Welsh", new String[] {"Lights" , "Wool" , "Other Moths"});
		Profile antony = new Profile("Antony", new Date(), "Hilltown", "Wales", "Welsh", new String[] {"Leaves", "Pathfinding", "Autocracy"});
		
		Assert.assertTrue(jim.toString().contains("name: Jim\n" + "dob: " + dFormated + "\ntownOfResidence: Splot\n" + "countryOfResidence: Wales\n" + "nationality: Welsh\n" + "interests: Sport , Food"));
		Assert.assertEquals(jimDate, jim.getDob());
		Assert.assertEquals(dFormated, jim.getDateOfBirth());
			
		jim.setCountryOfResidence("England");
		jim.setTownOfResidence("Oxford");
		jim.setNationality("English");
		jim.setInterests(tempInterests);
		Assert.assertTrue(jim.toString().contains("name: Jim\n" + "dob: " + dFormated + "\ntownOfResidence: Oxford\n" + "countryOfResidence: England\n" + "nationality: English\n" + "interests: Food , Golf , Chess"));
				
		jim.addFriend(simoth);
		jim.addFriend(antony);
		Assert.assertEquals(simoth, jim.getFriend(0));
		Assert.assertEquals(2, jim.numOfFriends());
		
		
	}

}

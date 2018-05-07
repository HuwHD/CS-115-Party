import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileReader {

	public static BST readProfiles(String filename) throws FileNotFoundException {

		File in = new File(filename);
		Scanner input = new Scanner(in);
		
		return constructBST(input);

	}

	public static BST constructBST(Scanner in) {

		BST profilesBST = new BST();

		while (in.hasNextLine()) {
			profilesBST.incertProfile(createProfile(in.nextLine()));

		}

		return profilesBST;

	}

	public static Profile createProfile(String profileString) {

		Scanner in = new Scanner(profileString);

		in.useDelimiter(",");

		String name = in.next();
		int dd = in.nextInt();
		int mm = in.nextInt();
		int yyyy = in.nextInt();
		String town = in.next();
		String country = in.next();
		String nationality = in.next();
		
		Date date;
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse(dd + "/" + mm + "/" + yyyy);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

		in.useDelimiter(";");
		ArrayList<String> interestsArray = new ArrayList<String>();

		while (in.hasNext()) {
			interestsArray.add(in.next());
		}

		String[] interests = interestsArray.toArray(new String[interestsArray.size()]);
		
		Profile profile = new Profile(name, date, town, country, nationality, interests);

		System.out.println(profile.toString());

		return profile;

	}

}

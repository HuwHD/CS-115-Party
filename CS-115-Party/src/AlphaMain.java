import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlphaMain {
	
	public static void main(String[] args) { 
		
		Profile jim = new Profile("Jim", new Date(), "Splot", "Wales", "Welsh", new String[] {"Sport", "Food"});
		Profile simoth = new Profile("Simoth", new Date(), "Roath", "Wales", "Welsh", new String[] {"Lights" , "Wool" , "Other Moths"});
		Profile antony = new Profile("Antony", new Date(), "Hilltown", "Wales", "Welsh", new String[] {"Leaves", "Pathfinding", "Autocracy"});
		Profile catlin = new Profile("Catlin", new Date(), "Splot", "Wales", "Welsh", new String[] {"Laps", "Yarn"});
		Profile boaris = new Profile("Boaris", new Date(), "Rumny", "Wales", "Welsh", new String[] {"Truffles" , "Mud" , "Running"});
		Profile alliGator = new Profile("Alli Gator", new Date(), "Splot", "Wales", "American", new String[] {"Swimming", "Mammals"});

		BST bst = new BST();
		bst.incertProfile(jim);
		bst.incertProfile(simoth);
		bst.incertProfile(antony);
		bst.incertProfile(catlin);
		bst.incertProfile(boaris);
		bst.incertProfile(alliGator);
		bst.incertProfile(simoth);
		
		bst.printAlphabetical(bst.getRoot());
		
		
	}
}

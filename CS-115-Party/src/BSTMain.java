import java.util.Date;

import org.junit.Assert;

/**
 * Test Class for BSTNode
 * @author Huw
 *
 */
public class BSTMain {

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
		
		Assert.assertEquals(jim, bst.getRoot().getProfile()); 
		Assert.assertEquals(simoth, bst.getRoot().getRight().getProfile()); 
		Assert.assertEquals(antony, bst.getRoot().getLeft().getProfile()); 
		Assert.assertEquals(catlin, bst.getRoot().getLeft().getRight().getProfile()); 
		Assert.assertEquals(boaris, bst.getRoot().getLeft().getRight().getLeft().getProfile()); 
		Assert.assertEquals(alliGator, bst.getRoot().getLeft().getLeft().getProfile()); 
		
	}

}

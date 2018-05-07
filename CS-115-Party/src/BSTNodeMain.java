import java.util.Date;
import org.junit.Assert;

/**
 * Test Class for BSTNode
 * @author Huw
 *
 */
public class BSTNodeMain {

	
	
	public static void main(String[] args) {
		
		Profile simoth = new Profile("Simoth", new Date(), "Roath", "Wales", "Welsh", new String[] { "Lights", "Wool", "Other Moths" });
		BSTNode node = new BSTNode(simoth);
		BSTNode rightNode = new BSTNode(simoth);
		BSTNode leftNode = new BSTNode(simoth); 
		
		Assert.assertEquals(simoth, node.getProfile());
		
		node.setLeft(leftNode);
		Assert.assertEquals(leftNode, node.getLeft());
		
		Assert.assertEquals(null, node.getRight());
		node.setRight(rightNode);
		Assert.assertEquals(rightNode, node.getRight());
	}
}

public class BST {

	private BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	public void incertProfile(Profile p) {

		if (root == null) {
			root = new BSTNode(p);
		} else {
			addToBT(root, p);
		}

	}

	private void addToBT(BSTNode currentNode, Profile p) {

		if (currentNode.getProfile().getName().compareToIgnoreCase(p.getName()) > 0) {

			if (currentNode.getLeft() == null) {
				currentNode.setLeft(new BSTNode(p));
			} else {
				addToBT(currentNode.getLeft(), p);
			}
		} else if (currentNode.getProfile().getName().compareToIgnoreCase(p.getName()) == 0) {

			/**
			 * Decision being made to override the existing profile if it has the same name
			 * as the new profile (collision). The key for each node must be unique. (chose
			 * this solution so to not alter specifically required code)
			 * 
			 * My solution to this would have been to alter BTSNode to contain a list of
			 * profiles.
			 **/
			BSTNode newNode = new BSTNode(p);
			newNode.setLeft(currentNode.getLeft());
			newNode.setRight(currentNode.getRight());
			currentNode = newNode;

		} else {
			if (currentNode.getRight() == null) {
				currentNode.setRight(new BSTNode(p));
			} else {
				addToBT(currentNode.getRight(), p);
			}
		}

	} 

	public void printAlphabetical(BSTNode node) {
		if (node != null) {
			printAlphabetical(node.getLeft());
			System.out.println(node.getProfile().getName());
			printAlphabetical(node.getRight());
		}
	}
}

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Assert;

public class FileReaderMain {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Enter file name:");
		Scanner in = new Scanner(System.in);
		BST bst = FileReader.readProfiles(in.nextLine()); 
		in.close();
	}

}

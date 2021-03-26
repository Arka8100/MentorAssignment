import java.io.File;
import java.io.FileWriter;

public class Assignment7 {
	
	public static void main(String[] args) {
		try {
			File myFile = new File("myFile.txt");
			if(myFile.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Already exists");
			}
			 FileWriter myWriter = new FileWriter(myFile);
		      myWriter.write("This is the new created File");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	  }
}

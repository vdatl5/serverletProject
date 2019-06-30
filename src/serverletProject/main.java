package serverletProject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path = Paths.get(args[0]);
		
		if(Files.exists(path)){
			System.out.print("Exists");
		}
		else{
			throw new IllegalArgumentException("Invalid File Path"); 	
		}
		
		
		
		
		
		
	}

}


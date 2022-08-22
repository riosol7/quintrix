package wk1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collections_Maps_FileIO {
	
	public void start() {
		List<String> studentList = new ArrayList<>();
		studentList.add(0, "Tom");
		studentList.add(1, "Peter");
		studentList.add("Jerry");
		studentList.set(0, "Tommy");
		
				
		
		// Set is an unordered collection of objects in which duplicates aren't allow. 
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Test");
		hash_Set.add("Set");
		Pattern pattern = Pattern.compile("test", Pattern.CASE_INSENSITIVE);
		for(String st : hash_Set) {
			Matcher matcher = pattern.matcher(st);
			boolean matchFound = matcher.find();
			if(matchFound) {
				System.out.println("Match Found");
			} else {
				System.out.println(matchFound);
			}
		};
		
		
		Map<String, String> nfl_Teams = new HashMap<>();
		nfl_Teams.put("Kansas City", "Chiefs");
		nfl_Teams.put("New England", "Patriots");
		nfl_Teams.put("New York", "Giants");
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("test");
			for(String s : studentList) {
				writer.write(s);
			};
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

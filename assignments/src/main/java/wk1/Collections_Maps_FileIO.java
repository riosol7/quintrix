package wk1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collections_Maps_FileIO {
	
	public void start() {
		
		System.out.println("========== \n" + "  Week 1 \n" + "========== \n");
		
		List<String> names = new ArrayList<>();
		names.add(0, "Tom");
		names.add(1, "Peter");
		names.add("Jerry");
		names.set(0, "Tommy");
		
				
		
		// Set is an unordered collection of objects in which duplicates aren't allow. 
		Set<String> s = new HashSet<String>();
		s.add("Test");
		s.add("Set");
		
		
		// REGEX
		Pattern pattern = Pattern.compile("test", Pattern.CASE_INSENSITIVE);
		
		for(String st : s) {
			Matcher matcher = pattern.matcher(st);
			boolean matchFound = matcher.find();
			if(matchFound) {
				System.out.println("Match found");
			} else {
				System.out.println("Match not found");
			}
		};
		
		Map<String, String> nfl_Teams = new HashMap<>();
		nfl_Teams.put("Kansas City", "Chiefs");
		nfl_Teams.put("New England", "Patriots");
		nfl_Teams.put("New York", "Giants");
		
		
		// FILE IO
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("test");
			for(String n : names) {
				writer.write(n);
			};
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("\n");
	}
}

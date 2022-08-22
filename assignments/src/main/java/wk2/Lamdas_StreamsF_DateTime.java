package wk2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.*;

import java.util.*;


public class Lamdas_StreamsF_DateTime {
	
	private Scanner myScanner;
	
	public Lamdas_StreamsF_DateTime(Scanner myScanner) {
		this.myScanner = myScanner;
	};
	
	public void start() {
		
		System.out.println("\n Week 2 \n");
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(8);
		System.out.println("Current Time: " + time + "\n" + "8hrs from now: " + newTime + "\n");
		
		List<Integer> score = new ArrayList<>();
		score.add(52);
		score.add(89);
		score.add(71);
		
		int sum = score.stream().reduce(0,(i, acc) -> i + acc);
		System.out.println("The total score is " + sum);

		int avg = score.stream().reduce(0, (i, acc) -> (i + acc)/score.size());
		System.out.println("The avg score is " + avg);
		
		long attempts = score.stream().count();
		System.out.println("Total attempts: " + attempts);
		
		System.out.println("\n" + "Select Time Zone: \n [S] Asia/Singapore \n [N] America/New York");
		String input = myScanner.nextLine().toLowerCase();
		
		
		switch(input) {
		
		case "s":
			df.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
			System.out.println("Date and time in Singapore: " + df.format(date));
			break;
			
		case "n": 
			df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
			System.out.println("Date and time in New York: " + df.format(date));
			break;
			
		default:
			System.out.println("Sorry wrong input, please try again");
			break;
		}
		
		
		

	}
}

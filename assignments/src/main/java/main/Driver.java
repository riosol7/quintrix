package main;

import java.util.Scanner;

import wk1.Collections_Maps_FileIO;
import wk2.Lamdas_StreamsF_DateTime;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collections_Maps_FileIO cmfIO = new Collections_Maps_FileIO();
		cmfIO.start();
	
		Lamdas_StreamsF_DateTime lsd = new Lamdas_StreamsF_DateTime(new Scanner(System.in));
		lsd.start();
	}

}

package practicals.conditionals;

import java.util.Scanner;

//Use scanner instead of these readers
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.String;
import java.io.IOException;


public class TestStack {
    public static void main(String[] args)throws IOException {
    	StackImplementation stack = new StackImplementation();
    	System.out.print("How many Integers ? : ");
    	Scanner myScanner = new Scanner(System.in);
    	int nosItems = myScanner.nextInt();
    	for (int i=1;i<=nosItems;i++ ) {
    		System.out.print("Enter a Integer : ");
	    	int item = myScanner.nextInt();
	    	stack.push(item);
    	}
    	System.out.print("Ready to Print ? :: Press Enter");
    	InputStreamReader reader = new InputStreamReader(System.in);
    	BufferedReader input = new BufferedReader(reader);
    	String next = input.readLine();
    	stack.pop();
    }
}

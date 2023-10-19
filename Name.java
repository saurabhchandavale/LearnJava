import java.lang.*;
import java.util.*;

class Name{
	public static void main(String args[]){
		
		String name;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("May I know your name");
		
		name = scn.nextLine();
		
		System.out.println("Welcome " + name);
		
	}
}
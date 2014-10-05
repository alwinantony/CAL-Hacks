import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class choreArray {
	public static int counter = 1;
	public static int choice;
	public static int choreNum = 5;
	public static String[] choreName = new String[5];
	public static String[] personName = new String[5];
	static Scanner kbd = new Scanner (System.in);
	
public static void main(String[] args) {
	choreName[0] = "Brush";
	choreName[1] = "Mopp";
	choreName[2] = "Vaccum";
	choreName[3] = "Clean Sink and Stove";
	choreName[4] = "Take out Trash and Recycle";
	personName[0] = "Neel";
	personName[1] = "Ian";
	personName[2] = "Alwin";
	personName[3] = "Sam";
	personName[4] = "Eric";
			
	System.out.println("Please press 1 to rotate, otherwise press anything else to exit.");
	choice = kbd.nextInt();
		System.out.println("----------------- Week " + counter + " -------------------");
		++counter;
		for(int i = 0; i < choreName.length; i++){
			System.out.println(personName[i] + " will \t" + choreName[i]);}
		
		choice = kbd.nextInt();
		while(rotate(choice) == 1){++counter;}
	}

public static int rotate(int myChoice){
	String last = choreName[choreName.length - 1];
	for (int k = choreName.length - 2; k >= 0; k--)
		choreName[k + 1] = choreName[k];
	choreName[0] = last;
	
	System.out.println("----------------- Week " + counter + " -------------------");
	for (int i = 0; i < personName.length; i++)
		for (int j = 0; j < choreName.length; j++) {
			if (i == j)
				System.out.println(personName[i] + " will \t" + choreName[j]);
		}
	
	myChoice = kbd.nextInt();
	return myChoice;
}
}

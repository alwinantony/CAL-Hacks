import java.util.*;
public class function{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number of chores: ");
		int chorenum = input.nextInt();
		String[] chores = new String[chorenum];
		Integer[] chorediff = new Integer[chorenum];
		for (int i = 0; i < chorenum; i++) {
			System.out.println("Input a chore name: ");
			chores[i] = input.next();
			System.out.println("Input \"" + chores[i] + "\" difficulty (1 being easy and 10 being hard): ");
			chorediff[i] = input.nextInt();
		}

		System.out.println("Input number of people: ");
		String[] people = new String[input.nextInt()];

		System.out.println("Enter names of people: ");
		for (int j = 0; j < people.length; j++)
			people[j] = input.next();
	
		
	}
}


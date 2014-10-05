import java.util.*;
public class chores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program rotates people's chores per week in a month. ");

		System.out.println("Enter number of chores: ");
		int chorenum = input.nextInt();

		String chores[] = new String[chorenum];
		for (int i = 0; i < chorenum; i++) {
			System.out.println("Input Chore " + (i + 1) + ": ");
			chores[i] = input.next();
		}

		System.out.println("Now enter number of people to split chores: ");
		int pplnum = input.nextInt();

		String people[] = new String[pplnum];
		for (int i = 0; i < pplnum; i++) {
			System.out.println("Name of Person " + (i + 1) + ": ");
			people[i] = input.next();
		}

		int week = 1;

		while (week != 5) {
			System.out.println("\nWeek " + week + " Responsibilities: ");
			for (int i = 0; i < chores.length; i++)
				for (int j = 0; j < people.length; j++) {
					if (i == j)
						System.out.println("\"" + chores[i] + "\" is assigned to: " + people[j]);
				}
			String last = people[people.length - 1];
			for (int k = people.length - 2; k >= 0; k--)
				people[k + 1] = people[k];
			people[0] = last;
			week++;
		}
	}
}

import java.util.Scanner;
public class main(
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input number of chores: ");
    int choresnum = input.nextInt();
    Chores(choresnum);
    System.out.println("Input number of people: ");
    int peoplenum = input.nextInt();
    People(peoplenum);
    
  }
}

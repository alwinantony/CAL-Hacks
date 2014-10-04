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
    
    System.out.println("Enter names of chores: ");
    for (int i = 0; i < choresnum; i++)
      addchore(i, input.nextString());
    
    System.out.println("Enter names of people: ");
    for (int j = 0; j < peoplenum; j++)
      addppl(j, input.nextString());
  }
}

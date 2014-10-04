import java.util.*;
public class function{
  public static void main(String[] args){
    String cName;
    int dNum;
    Hashtable <String, Integer> myChores = new Hashtable <String, Integer>();
    Scanner input = new Scanner(System.in);
    System.out.println("Input number of chores: ");
    int choresnum = input.nextInt();
    Chores chores = new Chores(choresnum);
    System.out.println("Input number of people: ");
    int peoplenum = input.nextInt();
    People people = new People(peoplenum);
    
    System.out.println("Enter names and difficulty of chores: ");
    for (int i = 0; i < choresnum; i++){
      System.out.println("Input chore name: ");
      cName = input.nextLine();
      System.out.println("Input chore difficulty: ");
      dNum = input.nextInt();
      myChores.put(cName, dNum);
    }
     
    System.out.println("Enter names of people: ");
    for (int j = 0; j < peoplenum; j++)
      people.addppl(j, input.nextLine());
  }
}

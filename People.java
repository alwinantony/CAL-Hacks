public class People{
  String[] people;
  People(int num){
    people = new String[num];
  }
  
  public void addppl(int num, String name){
    people[num] = name;
  }
}

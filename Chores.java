public class Chores{
  String[] chores;
  Chores(int num){
    chores = new String[num];
  }
  
  public void addchore(int num, String name){
    chores[num] = name;
  }
}

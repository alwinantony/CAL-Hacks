public class evenDifficulty{
  String[] names;
  String[] chores;
  Integer[] difficulties;
  String[][3] assingment;
  Names(String name){
    chores=new String[name];
  }
    Chores(int num){
    chores=new String[num];
  }
    Difficulties(int num){
    difficulty=new Integer[num];
  }
  public void assignChore(String[] names, String chores, Integer[] difficulties){
    averageDiff=difficulties.sum()/difficulties.length();
    for n=1:names.length(){
      assignment[n][1]=names(n);
      assignment[n][2]=chores(n);
      assignment[n][3]=difficulties(n);
      difficulties(n)=0;
      chores(n)='';
    }
    while (chores.length()>names.length()){
      array=quicksort(assignment);
      newdiff[n][2]=descendSort(chores,difficulties);
      for n=1:names.length(){
        array[n][2]=array[n][2]+newdiff[n][1];
        array[n][3]=array[n][3]+newdiff[n][2];
      }
      assignment=array;
      names=assignment[n][1];
      chores=assignment[n][2];
      difficulties=assignment[n][3];
    }
  }
  public void quickSort(){
    
  }
  public void descendSort(){
    
  }



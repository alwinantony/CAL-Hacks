public class evenDifficulty{
	String[] names;
	String[] chores;
	int[] difficulties;
	String[][] assignment;
	public void Names(int num){
		names=new String[num];
	}
	public void Chores(int num){
		chores=new String[num];
	}
	public void Difficulties(int num){
		difficulties=new int[num];
	}
	public void assignChore(String[] names, String chores, int[] difficulties){
		double averageDiff=difficulties.sum()/difficulties.length();
		for (int n : names.length()){
			assignment[n][1]=Names(n);
			assignment[n][2]=Chores(n);
			assignment[n][3]=Difficulties(n);
			difficulties(n)=0;
			chores[n]=null;
		}
		while (chores.length()>names.length()){
			array=quicksort(assignment);
			newdiff[n][2]=descendSort(chores,difficulties);
			for (n=1:names.length()){
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
}

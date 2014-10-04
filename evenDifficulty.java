public class evenDifficulty{
	String[][] assignment;

	public void assignChore(String[] names, String[] chores, int[] difficulties) {
		int diffsum = 0;
		for (int i = 0; i < difficulties.length; i++)
			diffsum += difficulties[i];
		double averageDiff = diffsum / difficulties.length;
		for (int n = 0 ; n < names.length; n++) {
			assignment[n][0] = names[n];
			assignment[n][1] = chores[n];
			int temp = difficulties[n];
			String converted = Integer.toString(temp);
			assignment[n][2] = converted;
			difficulties[n] = 0;
			chores[n] = null;
		}

		while (chores.length > names.length){
			String[][] array = quickSort(assignment);
			String[][] newdiff;
			newdiff = descendSort(chores, difficulties);
			for (int n = 0; n < names.length; n++){
				array[n][1] = array[n][1] + newdiff[n][0];
				array[n][2] = array[n][2] + newdiff[n][1];
			}

			for (int n = 0 ; n < names.length; n++) {
				names[n] = assignment[n][0];
				chores[n] = assignment[n][1];
				String temp = assignment[n][2];
				int converted = Integer.parseInt(temp);
				difficulties[n] = converted;
			}
		}
	}
}

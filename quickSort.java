public class quickSort{
  public static int partition(int[] array,a,b){
    int pivot=array[a];
    while(a<b){
      while(array[a]<pivot){
        a++;
      }
      while(array[b]>pivot){
        b--;
      }
      if(a<b){
        int t=array[a];
        array[a]=array[b];
        array[b]=t;
        a++;
        b--;
      }
      else{
        return b;
      }
    }
    return a;
  }
  public static void quickSort(int[] array,a,b){
    pivot=partition(array,a,b);
    if(pivot>1){
      quickSort(array,a,b-1);
    }
    if(pivot+1<b){
      quickSort(array,a+1,b);
    }
  }
}


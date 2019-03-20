public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    /*
    mergesort(data,lo,hi):
  if lo >= hi :
    return
  mergesort left side
  mergesort right side
  merge
    */
    mergesort(data, 0, data.length-1);
  }

  private static void mergesort(int[]data, int lo, int hi){
    if (lo >= hi){
      return;
    }
    else{
      int mid = (hi+lo)/2;
      mergesort(data, lo, mid);
      mergesort(data, mid + 1, hi);
      merge(data, lo, mid, hi);
    }

  }

  //take two array and add to original array(data)
  public static void merge(int[] data, int lo, int mid, int hi){
    int[] left = new int[mid-lo +1];
    int[] right = new int[hi - mid];
    int lt = 0;
    for (int l = lo; l <= mid; l++){//get data for left array
      left[lt] = data[l];
      lt++;
    }
    int rt = 0;
    for (int r = mid+1; r <= hi; r++){//get data for right array
      right[rt] = data[r];
      rt++;
    }
    lt = 0;
    rt = 0;
    int count = lo;
    /*
    int[] combined = new int[left.length+right.length];
    while(count < combined.length && lt < left.length && rt < right.length){
      if (left[lt] <= right[rt]){ //if the current value at left is less than right, add it first
        data[count] = left[lt];
        lt++;
        count++;
       }
       else{
         data[count] = right[rt];
         rt++;
         count++;
       }
    }*/
    while (count <= hi){
      if (lt == left.length){
        lt = -1;
      }
      if (rt == right.length){
        rt = -1;
      }
      if (lt < 0 || rt < 0){
        if (lt < 0 && rt >= 0){
          data[count] = right[rt];
          rt++;
          count++;
        }
        else if (rt < 0 && lt >= 0){
          data[count] = left[lt];
          lt++;
          count++;
        }
      }
      //finished handling if one array is shorter than the other
      //now handling non ending case:
      else if (left[lt] <= right[rt]){ //if the current value at left is less than right, add it first
        data[count] = left[lt];
        lt++;
        count++;
       }
       else{
         data[count] = right[rt];
         rt++;
         count++;
       }
    }
  }

}

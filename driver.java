import java.util.Arrays;
public class driver{
  public static void main(String[]args){
    int[] testing = new int[]{1,10,5,3};
    for (int i = 0; i < testing.length; i++){
      System.out.print(testing[i] + ", ");
    }
    System.out.println();
    Merge.mergesort(testing);
    for (int i = 0; i < testing.length; i++){
      System.out.print(testing[i] + ", ");
    }
    System.out.println();

  }
}

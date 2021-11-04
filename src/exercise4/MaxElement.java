package exercise4;

import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();  
    float[] arr = new float[n];
    float max = -100;

    for(int i = 0; i < n; i ++)
    {
      arr[i] = input.nextInt();
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("Max number: " + max);

    
    
       
    }

}



    

package Project7;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Project7 {

  
    public static void main(String[] args) {
  
       System.out.print("Enter array size:");      
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
           
            int[] array = new int[size];
            populateArray(array);

            Random rand = new Random();
            int target = rand.nextInt(1001);

            SearchAlgorithms.linearSearch(array, target);
            
            Arrays.sort(array);
            SearchAlgorithms.binarySearch(array, target);
            
    }
        public static void populateArray(int[] array)
        {
            Random rand = new Random();
            
              for (int i = 0; i< array.length; i++)
            array[i] = rand.nextInt(1001);
        }
     
    }
    


package Project7;


public class SearchAlgorithms {
    
   
    //It searches for a number linearly by comparing every
        //integer from left to right
        public static void linearSearch(int[] array, int target)
        {
            
            System.out.println();
            for(int i = 0; i<array.length; i++)
            {
                if(target == array[i])
                {
                    System.out.println("Linear Search: target " + target + " found. Number of steps is " + i);
                    return;
                }
            }
            System.out.println("Linear Search: target " + target + " not found. Number of steps is " + array.length);
        }
        
        //binary search 
        //has to be a sorted array
        //just keeps dividing the array in half
        public static void binarySearch(int[] array, int target)
        {
            int min = 0;
            int max = array.length-1;
            int mid;
            int count = 0;
            
            while(min <= max)
            {  
                count++;
                mid = (min + max)/2;
                
                if(array[mid] < target)
                {
                    min = mid + 1;
                }
                else if (array[mid] > target) 
                {
                    max = mid - 1;
                }
                
                else{
                    System.out.println("Binary Search: target " + target + " found. Number of steps is " + count);
                    return;
                }
            }
                    
                    System.out.println("Binary Search: target " + target + " not found. Number of steps is " + count);   
        }
        
}

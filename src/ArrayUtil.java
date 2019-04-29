import java.util.Random;
 
 /**
04:    This class contains utility methods for array 
05:    manipulation.
06: */  
 public class ArrayUtil
 { 
    /**
10:       Creates an array filled with random values.
11:       @param length the length of the array
12:       @param n the number of possible random values
13:       @return an array filled with length numbers between
14:       0 and n - 1
15:    */
    public static int[] randomIntArray(int length, int n)
    {  
       int[] a = new int[length];      
       for (int i = 0; i < a.length; i++)
          a[i] = generator.nextInt(n);
       
       return a;
    }
 
    /** 
26:       Prints all elements in an array.
27:       @param a the array to print
28:    */
    public static void print(int[] a)
   {  
       for (int e : a)
          System.out.print(e + " ");
       System.out.println();
   }
 
    private static Random generator = new Random();
 }
       

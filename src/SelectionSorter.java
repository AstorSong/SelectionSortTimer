/**
02:    This class sorts an array, using the selection sort 
03:    algorithm
04: */
 public class SelectionSorter
 {
    /**
08:       Constructs a selection sorter.
09:       @param anArray the array to sort
10:    */
    public SelectionSorter(int[] anArray)
    {
       a = anArray;
    }
 
    /**
17:       Sorts the array managed by this selection sorter.
18:    */
    public void sort()
    {  
       for (int i = 0; i < a.length - 1; i++)
       {  
          int minPos = minimumPosition(i);
          swap(minPos, i);
       }
    }
 
    /**
29:       Finds the smallest element in a tail range of the array.
30:       @param from the first position in a to compare
31:       @return the position of the smallest element in the
32:       range a[from] . . . a[a.length - 1]
33:    */
    private int minimumPosition(int from)
    {  
       int minPos = from;
       for (int i = from + 1; i < a.length; i++)
          if (a[i] < a[minPos]) minPos = i;
       return minPos;
    }
 
    /**
43:       Swaps two entries of the array.
44:       @param i the first position to swap
45:       @param j the second position to swap
46:    */
    private void swap(int i, int j)
    {
       int temp = a[i];
       a[i] = a[j];
       a[j] = temp;
    }
 
    private int[] a;
 }
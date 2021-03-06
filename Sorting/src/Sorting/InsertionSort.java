package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] num) {
		//TODO: S2 implements insertion sort
		int j;                     // the number of items sorted so far
     		int key;                // the item to be inserted
     		int i;  

     		for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
    		{
           		key = num[ j ];
           		for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
          		{
                		num[ i+1 ] = num[ i ];
          		}
        		num[ i+1 ] = key;    // Put the key in its proper location
     		}
		return num;
	}
}

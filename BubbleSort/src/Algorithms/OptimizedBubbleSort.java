package Algorithms;

public class OptimizedBubbleSort {
	
//Optimized BubbleSort
	
	public static void optimizedBubbleSort(int[] array) { 
        int n = array.length;  
        boolean swapped;  
        for (int i = 0; i < n - 1; i++) {  
            swapped = false;  
            for (int j = 0; j < n - 1 - i; j++) {  
                if (array[j] > array[j + 1]) {  
                     
                    int temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp; 
                    swapped = true;  
                } 
            } 
            if (!swapped)  
                break;  
        } 
    } 
 
     
    public static void printArray(int[] array) { 
        for (int i : array) 
            System.out.print(i + " ");  
        System.out.println();  
    } 

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[] array = {95, 45, 25, 5, 75, 15, 105};  
	
	System.out.println("Unsorted array:"); 
	printArray(array);  
	optimizedBubbleSort(array);  
	System.out.println("Sorted array:"); 
	printArray(array);  

}

}
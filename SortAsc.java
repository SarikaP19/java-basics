public class SortAsc {   
	    public static void main(String[] args) {        
	                
	        int [] arr = new int [] {23,12,45,67,90,23,54,67,8,1,14};     
	        int temp = 0;    
	              
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	             
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }     
}

import java.util.Arrays;
public class exercise {
	public static void main(String[] args) {

	   int[] my_array = {23,12,45,677,90,54,8,1,14};

	   
	   int Index_position = 8;
	   int newValue    = 19;

	  System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	  for(int i=my_array.length-1; i > Index_position; i--){
	    my_array[i] = my_array[i-1];
	   }
	   my_array[Index_position] = newValue;
	   System.out.println("New Array: "+Arrays.toString(my_array));
	 }
	 
}

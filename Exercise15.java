import java.util.Arrays; 
public class Exercise15 {
public static void main(String[] args) 
    {
      int[] array1 = {23,12,45,67,90,23,54,67,8,1,14};
      int[] array2 = {43,32,45,97,90,23,54,7,8};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}

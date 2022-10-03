public class indexelement {
       public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {23,12,45,67,90,54,8,1,14};
      System.out.println("Index position of 23 is: " + findIndex(my_array, 25));
      System.out.println("Index position of 1 is: " + findIndex(my_array, 77));
       }
}

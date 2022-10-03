public class ArrayElementSelection{
    public static int findSecondSmallest(int[] a){
            int N = a.length;
            int min = 0;
            int secondSmallest = 0;
            for(int i=1;i<N;i++){
                if(a[i] < a[min]){
                    secondSmallest = min;
                    min = i;

                }else if(a[i] < a[secondSmallest]){
                    secondSmallest = i;
                }
            }
            return a[secondSmallest];
        }

    public static int findThirdSmallest(int[] a){
            int N = a.length;
            int min = 0;
            int secondSmallest = 0;
            int thirdSmallest = 0;
            for(int i=1;i<N;i++){
                if(a[i] < a[min]){
                    min = i;
                }else if(a[i] < a[secondSmallest]){
                    secondSmallest = i;
                }else if(a[i]< a[thirdSmallest]){
                    thirdSmallest = i;
                }
            }

            return a[thirdSmallest];
        }

    public static void main(String[] args) {
         int[] a = new int[]{23,128,45,67,90,54,88,1,14};
         System.out.println(findThirdSmallest(a));
    }
}

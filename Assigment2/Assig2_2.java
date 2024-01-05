package Assigment2;

public class Assig2_2 {

        public static int insertionsortdes(int[] arr){

            for(int i=1;i<arr.length;i++)
            {
                int key=arr[i];
                int j=i-1;

                while (j>=0 && arr[j]<key) {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
            return 1;
        }



    public static void main(String[] args) {
        int[] arr={4,5,1,33,12,11,16};

        insertionsortdes(arr);

        System.out.println("sorted array in desending");
        for(int num:arr){
            System.out.println(num);
        }
    }
}

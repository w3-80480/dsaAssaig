package Assigment2;

public class Assig2_1 {

    public static int insertionsort(int[] arr){
        int comp=0;

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while (j >=0 && arr[j] > key) {
                arr[j +1]=arr[j];
                j--;
                comp++;
        }
            arr[j+1]=key;
     }
            return comp;
    }






    public static void main(String[] args) {
        int[] arr={13,11,4,23,17,4};

        int comp=insertionsort(arr);

        System.out.println("sorted arr :" );
        for(int num:arr){
            System.out.println(num);
        }

        System.out.println("comparision : "+comp);
    }
}

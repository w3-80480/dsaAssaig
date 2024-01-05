package Assignment1;
import java.util.Scanner;

public class Assig1_5 {

    public static int binarysearch(int[] arr,int key){
        int left=0;
        int right= arr.length-1;

        while (left <= right) {
            int mid=left+(right-left)/2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                left = mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        int[] arr={99,88,77,66,55,44,33,22,11};
        Scanner sc= new Scanner(System.in);

        System.out.println("enter key to search");
        int key=sc.nextInt();

        int res= binarysearch(arr,key);

        if (res != -1) {
            System.out.println("key is found at"+ res);
        }
        else
        {
            System.out.println("key is not found");
        }
        sc.close();
    }
}

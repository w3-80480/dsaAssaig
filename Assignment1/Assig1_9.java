package Assignment1;
public class Assig1_9 {
    public static void main(String[] args) {
        
        int[] arr={5,8,9,1,3};
        
        for(int i=0; i<arr.length-1;i++)
        {  
            for(int j=i+1 ; j<arr.length; j++)
            {
                if (arr[i]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i:arr)
        System.out.println(i+"");
    }
}

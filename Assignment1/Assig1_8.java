package Assignment1;
public class Assig1_8 {

    public static int solve( int[] arr,int rank){

        int k=0;
        for(int i:arr)
        {
            if(i<=rank)
            k+=1;
        }
        return k;
    }




    public static void main(String[] args) {
        
        int[] arr={10,20,15,3,4,4,1};
        int rank=4;

        int ans= solve(arr,rank);
        System.out.println(ans);

    }
}

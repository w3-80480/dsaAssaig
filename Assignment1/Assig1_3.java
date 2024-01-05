package Assignment1;
public class Assig1_3 {

    public static int linearsearch(int[] arr,int key){
        int comp=0;

        for(int i=0; i<arr.length;i++){
            comp++;

            if(arr[i]==key){
                return comp;
            }
        }

        return comp;
    }





    public static void main(String[] args) {
        int[] arr={4,23,11,6,14,3,2};

        int key =11;

        int comp=linearsearch(arr,key);

        if(comp == arr.length){
            System.out.println(key);
        }
        else
        {
            System.out.println(key);
            System.out.println(comp);
        }

    }
}

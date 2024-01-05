package Assignment1;
public class Assig1_2 {

    public static int lastoccurance(int[] arr,int key){
        int lastind=-1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                lastind=i;
            }
        }
        return lastind;
    }

    public static void main(String[] args) {
        
        int[] arr={2,5,6,7,1,2,3,8};

        int key=2;

        int lastind= lastoccurance(arr,key);

        if(lastind != -1){
            System.out.println(key + "at index" + lastind);   
        }
        else
        {
            System.out.println(key + "not found");
        }
    }
}

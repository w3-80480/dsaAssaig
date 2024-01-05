package Assigment2;

public class Assig2_4 {
    private static final int size=5;
    private int top;
    private int[]stack;

    public Assig2_4(){
        top=size-1;
        stack=new int[size];
    }

    public void push(int value){

        if(top >=0){
           stack[top--]= value;
           System.out.println(value);
        }

    }

    public void pop(){

        if(top<size-1){
            int popele=stack[++top];
            System.out.println("pop element is :"+popele);
        }
    }

    public void disp(){

        System.out.println("elements in stack");
        for(int k=size-1; k>top;k--){
            System.out.println(stack[k]);
        }
       // System.out.println();
    }



    public static void main(String[] args) {
      //  descStack stack=new descStack();
        Assig2_4 Stack=new Assig2_4();

        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);

        Stack.disp();

        Stack.pop();




    }
}

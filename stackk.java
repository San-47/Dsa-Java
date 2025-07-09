 class stack {
        int[] arr;
        int top;
        int size;
        
        stack(int size)
        {
            this.size=size;
            top=-1;
            arr=new int[size];
         }

         void push(int val){
            top=top+1;
            arr[top]=val;
         }
 }

public class stackk{
    public static void main(String[] args) {
        stack s1 = new stack(4);

        s1.push(10);
    }
}


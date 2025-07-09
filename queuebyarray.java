 class queueusingarray {
        int[] queue;
        int front;
        int rear;
        int size;
        queueusingarray(int size)
        {
            this.size=size;
            queue=new int[size];
            rear=-1;
            front=-1;
         }

         void enqueue(int val)
         {
            if(rear==size-1){
                System.out.print("queue full");
                System.out.println("");
                return;
            }
            if(rear==-1){
                front=0;
            }
            queue[++rear]=val;
         }

         void dequeue(){
            if(rear==-1){
                System.out.println("queue empty!");
                return;
            }
            for(int j=0;j<rear;j++){
                queue[j]=queue[j+1];
            }
            rear--;
         }


         void display(){
            if(rear==-1){
                System.out.print("queue empty!");
                return;
            }
           
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
         }
}
public class queuebyarray{
    public static void main(String[] args){
        queueusingarray q1 =  new queueusingarray(5);
            q1.enqueue(10);
            q1.enqueue(20);
              q1.enqueue(30);
               q1.enqueue(40);
                q1.enqueue(50);
                 q1.display();
                q1.enqueue(60);
                q1.dequeue();
                q1.display();
             
    }
}
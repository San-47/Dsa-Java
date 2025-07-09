class queueusingarray{
    int[] queue;
    int rear;
    int front;
    int size;
     queueusingarray(int size) {
        this.size=size;
        front=-1;
        rear=-1;
        queue=new int[size];

    }
    
    void enqueue(int d){
        if(rear==size-1){
            System.out.println("queue full!");
            return;
        }
        if(rear==-1){
            front=0;
        }
        queue[++rear]=d;
        System.out.println(rear);
    }
    void dequeue(){
        if(rear==-1){
            System.out.println("cant dequeue as the queue is empty!");
            return;
        }
        for(int i=front;i<rear;i++){
            queue[i]=queue[i+1];
        }
        rear--;
    }
    
    void display(){
        if(rear==-1){
            System.out.println("queue empty!");
            return;
        }
        
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println("");
    }
}

public class queuebyarray{
    public static void main(String[] args){
        queueusingarray q1 =new queueusingarray(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        
        
        q1.display();

        q1.dequeue();
        q1.display();
    }
}
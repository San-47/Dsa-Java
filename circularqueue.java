class circqueue{
    int[] queue;
    int size;
    int front;
    int rear;

     circqueue(int size) {
        queue=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
    }

    void enqueue(int val){
        if((rear+1)%size==front){
            System.out.println("queue full cant add!");
            return;
        }
        if(rear==-1){
            front=0;
        }
        rear=(rear+1)%size;
        queue[rear]=val;

    }


    void dequeue()
    {
        if(rear==-1){
            System.out.println("cant dequeue as the list is empty");
            return;
        }
        if(rear==front){
            rear=-1;
            System.out.println("only element removed");
            return;
        }
        front=(front+1)%size;
    }

    void display(){
        if(rear==-1){
            System.out.println("queue empty");
            return;
        }

        int i=front;
        while(i!=rear){
            System.out.print(queue[i]+" ");
            i=(i+1)%size;
        }
        System.out.print(queue[i]);
        System.out.println("");
    }
       
    
}

 public class circularqueue {
    public static void main(String[]args){
        circqueue q1 = new circqueue(5);

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        
        q1.display();

        q1.enqueue(60);
    }
 }

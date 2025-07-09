class queue{
    node front=null;
    node rear=null;
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            next=null;
        
        }
    }


    void enqueue(int d)
    {
        node nn = new node(d);
        if(front==null)
        {
            rear=nn;
            front=nn;
            return;
        }
        rear.next=nn;
        rear=nn;
    }
    void dequeue(){
        front=front.next;
    }

    void display()
    {
        if(front==null){
            System.out.println("queue empty!");
            return;
        }
        node tptr=front;
        while(tptr!=null)
        {
            System.out.print(tptr.data+" ");
            tptr=tptr.next;
        }
        System.out.println("");
        
    }
}

public class queueusingnode{
    public static void main(String[]args){
        queue q1 = new queue();
       q1.enqueue(10);
       q1.enqueue(20);
       q1.enqueue(30);
       q1.enqueue(40);
        q1.display();
        q1.dequeue();
        q1.display();
    }
}
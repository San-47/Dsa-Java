import java.util.*;
class costlydequeue{
    Stack <Integer> s1= new Stack<>();
    Stack <Integer> s2 =new Stack<>();

    void enqueue(int v){
        s1.push(v);
    }

    void dequeue()
    {
        if(s2.isEmpty())
        {
            if(s1.isEmpty())
            {
            System.out.println("queue underflow");
            return;
            }
        
          while(!(s1.isEmpty()))
          {
            s2.push(s1.pop());
          }
        }
        System.out.println(s2.pop());
    }

    public void display(){
       System.out.println(s2); 
    }

}

public class queueimpusingstack{
  public static void  main(String[]args){
    costlydequeue q1 = new costlydequeue();
    q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);

		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.enqueue(40);
		q1.dequeue();
  }
  
}
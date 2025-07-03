class LL
{
    node start;
        class node
        {
            int data;
            node next;
        
            node(int d)  //constructor
            {
                data = d;
                next=null;
                
            }
        }
            
            public void insertBeg(int v)
            {
                 node newNode = new node (v);
                 newNode.next=start;
                 start = newNode;
            }
            
            
            
             public void insertEnd(int v)
            {
                 node newNode = new node (v);
                 if(start==null)
                 {
                     start=newNode;
                     return;
                 }
                 node tptr=start;
                 while(tptr.next!=null)
                 {
                     tptr=tptr.next;
                 }
                 tptr.next=newNode;
                 
            }
            
            
            
            public void display()
            {
                node ash=start;
                while(ash!=null)
                {
                    System.out.print(ash.data+" ");
                    ash=ash.next;
                }
            }
            
            public int count()//count the values
            {  
                int c=0;
                node tptr=start;
                while(tptr!=null)
                {
                    tptr=tptr.next;
                    c++;
                    
                }
                return c;
            }
            
            
            
            
             public void insertPos(int a , int n)
             {
                 int x=count();
                 
                 if(n==1){
                     insertBeg(a);
                     return;
                 }
                 
                 if(n<0||n>x){
                     System.out.print("not possible to insert");
                 }
                 
                node newNode = new node(a);
                node tptr=start;
                 for(int i=1;i<n-1;i++)
                 {
                         tptr=tptr.next;
                 }
        
                    newNode.next=tptr.next;
                    tptr.next=newNode;
            }
            
         //deleted in front with 2 cases size=0 and 1
         public void deleteBeg(){
             int size=count();
             if(size==0){
                 System.out.println("cant delete at when size is "+size);
                 return;
             }
             
             if(size==1){
                 start=start.next;
                 System.out.println("first node deleted and the list is empty rn");
                 return;
                 
             }
             start=start.next;
         }
         
         
         
         //deletion in end with cases
        public void deleteEnd()
        {
            if(start==null){
                System.out.println("no node to delete");
                return;
            }
            if(start.next==null){
                start=start.next;
                System.out.println("list end node deleted");
                return;
            }
            
            node tptr=start;
            while(tptr.next.next!=null){
                tptr=tptr.next;
            }
            tptr.next=null;
        }
        
        
        public void deletePos(int pos){
            int size=count();
            if(pos<=0||pos>size){
                System.out.println("cant delete");
                return;
            }
            node tptr=start;
            for(int i=1;i<pos-1;i++)
            {
                tptr=tptr.next;
            }
            
            tptr.next=tptr.next.next;
        }
        

}




public class linkedlist
{
	public static void main(String[] args) 
	{
	LL list1=new LL();
	list1.insertBeg(10);
	list1.insertBeg(20);
	list1.insertBeg(30);
	list1.insertBeg(50);
	
	list1.insertEnd(40);
	list1.insertEnd(70);
	
	
	
	
    
	
	
	list1.display(); // bfr deletion
	list1.deletePos(3);
	System.out.println();
	list1.display();//aftr deletion
	
	}
}

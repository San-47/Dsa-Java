class dd{
    node start;
    class node{
        int data;
        node prev;
        node next;
        
        node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    

        public void displayForward()
        {
            node ptr=start;
            while(ptr!=null){
                System.out.print(ptr.data+"->");
                ptr=ptr.next;
            }
                        System.out.println();
        }
        
         public void displayBackwards()
        {
            node ptr=start;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.prev;
            }
            System.out.println();
        }

       public void insertBeg(int v)
       {
            node newNode = new node(v);
            if(start==null) 
            {
                start=newNode;
            }else
            {
            start.prev=newNode;
            newNode.next=start;
            start=newNode;
            }
        }

        public void insertEnd(int v)
        {
            node newNode = new node (v);
           
           if(start==null){
            start=newNode;
           }
           else
           {
            node ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            newNode.prev=ptr.next;
            ptr.next=newNode;
           }
        }
    
        public void insertPos(int v,int pos){
            node newNode =  new node( v);
            node ptr=start;
            if(pos==1){
                insertBeg(v);
            }
            else{
                for(int i=1;i<pos-1;i++)
                {
                    ptr=ptr.next;
                }
                newNode.next=ptr.next;
                newNode.prev=ptr;
                ptr.next=newNode;
                newNode.next.prev=newNode;
            }
        }


}




public class doublyLinkedList{
	public static void main(String[] args) {
		dd list1 = new dd();
		list1.insertBeg(20);
		list1.insertBeg(30);
		list1.insertBeg(40);

        list1.insertEnd(50);
        
        list1.insertPos(35,3);
		list1.displayForward();
		
	}

}
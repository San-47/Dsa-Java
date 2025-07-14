

class bt{
    class tnode{
        int data;
        tnode left;
        tnode right;
        tnode(int d){
            data=d;
            right=null;
            left=null;
            
        }
    }
    tnode root=null;
    bt(int val){
        root = new tnode(val);
    }

    void insertleft(tnode n,int v){
        tnode NN = new tnode(v);
        n.left=NN;
        
    }
    void insertright(tnode n,int v){
        tnode NN = new tnode(v);
        n.right=NN;
        
    }
    void preorder(tnode n){
        if(n!=null){
            System.out.print(n.data+" ");
            preorder(n.left);
            preorder(n.right);
        }
      }

      void postorder(tnode n)
      {
        if(n!=null){
        
            postorder(n.left);
            postorder(n.right);
             System.out.print(n.data+" ");
        }
    }

    void inorder(tnode n)
      {
        if(n!=null){
        
            inorder(n.left);
            System.out.print(n.data+" ");
            inorder(n.right);
             
        }
    }
}


public class tree{
    public static void main(String[]args){

        bt tree = new bt(10);
        tree.insertleft(tree.root, 20);
        tree.insertright(tree.root, 30 );
        tree.preorder(tree.root);
        System.out.println();
         tree.postorder(tree.root);
         System.out.println("");
          tree.inorder(tree.root);

    }
}
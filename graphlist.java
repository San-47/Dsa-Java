import java.util.*;

public class graphlist
{
    static int v[]={10,15,25,30};
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    public static int getindex(int k){
        for(int i=0;i<v.length;i++){
            if(k==v[i]){
                return i;
            }
        }
        return -1;
    }

    public static void add(int i,int j)
    {
            int r=getindex(i);
            int c=getindex(j);
            graph.get(r).add(c);
             graph.get(c).add(r);


            
    }

     public static void degree(){
         for(int i=0;i<v.length;i++){
	        System.out.println(v[i]+"->"+graph.get(i).size());
	    }
    }





       public static void display()
	{
	    for(int i=0;i<v.length;i++)
        { 
	        System.out.print( v[i]+": ");
	    for(int k:graph.get(i))
        {
	    System.out.print(v[k]+" ");
        }
	        System.out.println("");
    }
	}

    public static void main(String[] args){

        for(int i=0;i<v.length;i++)
        {
	    graph.add(new ArrayList<>());
        }

        add(10,15);
        add(10,30);
        add(15,25);
        display();
        degree();
    }
}
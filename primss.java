import java.util.*;


class Edge{
    int to,wt;
    Edge(int t,int w){
        to=t;
        wt=w;
    }
}
public class primss
{
    static int v[]={10,15,20,25,30};
   static List<List<Edge>> graph=new ArrayList<>();

    public static int getindex(int k){
        for(int i=0;i<v.length;i++){
            if(k==v[i]){
                return i;
            }
        }
        return -1;
    }

    public static void add(int i,int j,int wt)
    {
            int r=getindex(i);
            int c=getindex(j);

            graph.get(r).add(new Edge(c,wt));
            graph.get(c).add(new Edge(r,wt));
            


            
    }






   


      public static void prims (int start){
        boolean seen[]=new boolean[v.length];
        int min=0;
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.wt-b.wt); //min heap
        
        seen[getindex(start)]=true;
        pq.addAll(graph.get(getindex(start)));
       // System.out.print(pq);
        while(!pq.isEmpty())
      {
          Edge rem=pq.remove();
           
          if(seen[rem.to]==true) continue;
           
          seen[rem.to]=true;
          min+=rem.wt;
           
          for(Edge e:graph.get(rem.to)){
              if(!seen[e.to])
              pq.add(e);
          }
      }
      System.out.print("Min cost: "+min);
    }

    


    

    public static void main(String[] args){

        for(int i=0;i<v.length;i++)
        {
	    graph.add(new ArrayList<>());
        }

        add(10,15,4);
        add(10,30,1);
        add(15,20,3);
        add(20,30,5);
        add(25,30,2);
        add(15,25,6);
        prims(10);
       
    }
}
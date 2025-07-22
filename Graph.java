public class Graph{
    static int v[]={10,15,25,30};
    static int arr[][]=new int[4][4];

    public static int getindex(int k){
        for(int i=0;i<v.length;i++){
            if(k==v[i]){
                return i;
            }
        }
        return -1;
    }

    public static void add(int i,int j){
            int r=getindex(i);
            int c=getindex(j);
            arr[r][c]=1;
            arr[c][r]=1;
    }
       public static void display()
	{
	    System.out.print("  ");
	    
	    for(int k=0;k<v.length;k++)
	    {
	        System.out.print(v[k]+" ");
	    }
	    System.out.println();
	    
	    
	    for(int i=0;i<v.length;i++){
	        System.out.print(v[i]+" ");
	        for(int j=0;j<v.length;j++){
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
	}

    public static void main(String[]args){
        add(10,15);
        add(10,30);
        add(15,25);
        display();
    }
}
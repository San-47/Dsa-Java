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
	    
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
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
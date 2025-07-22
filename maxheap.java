
public class maxheap{
    static int arr[]=new int[50];
    static int size=0;


    public static void add(int v){

        arr[size]=v;
        int i=size;

        size++;

        while(i>0)
        {
                int p=(i-1)/2;
                if(arr[p]<arr[i])
                {
                    int temp=arr[p];
                    arr[p]=arr[i];
                    arr[i]=temp;
                     i=p;
                }
                else
                {
                    break;
                }
        }

    }

    public static void delete(){
        arr[0]=arr[size-1];
        //arr[size-1]=0;
        size--;
        int i=0;

        while((2*i+1)<size){
            int max=i;
            int l=(2*max)+1;
            int r=(2*max)+2;

            if(arr[max]<arr[l]){
                max=l;
            }
            if(arr[max]<arr[r]){
                max=r;
            }

            if(i!=max){
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]= temp;
                i=max;
            }
            else{
                break;
            }
        }
        


 
        
        
        
    }

    public static void main(String []args){

    add(50);
	add(30);
	add(20);
	add(15);
	add(10);
	add(8);
	add(16);
		
		
		for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");
        System.out.println("");

        delete();

        for(int i=0;i<size;i++)
		System.out.print(arr[i]+" ");
        System.out.println("");
       
    }
}

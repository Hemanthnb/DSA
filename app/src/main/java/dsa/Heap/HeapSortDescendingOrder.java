package dsa.Heap;
public class HeapSortDescendingOrder {

    void swap(int arr[],int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    void heapify(int arr[], int firstIndex, int lastIndex){
        int smallest=firstIndex;
        
        while(smallest<lastIndex){
            int ptr1=(smallest*2)+1;
            int ptr2=(smallest*2)+2;
            if(ptr1<=lastIndex && arr[smallest]>arr[ptr1]){
                smallest=ptr1;
            }
            if(ptr2<=lastIndex && arr[smallest]>arr[ptr2]){
                smallest=ptr2;
            }
            if(smallest!=firstIndex){
                swap(arr, firstIndex, smallest);
                firstIndex=smallest;
            }
            else{
                break;
            }
        }
    }
    
    void heapSort(int arr[]){
        int size=arr.length;
        while (size>0) {
            swap(arr, 0, --size);
            heapify(arr, 0, size-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={7,9,1,3,2,8,10,11,12};
        int i=(arr.length/2)-1;
        HeapSortDescendingOrder obj= new HeapSortDescendingOrder();
        while (i>=0) {
            obj.heapify(arr, i, arr.length-1);
            i--;
        }
        System.out.println("Implemented Min Heap");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n------------------------------");

       obj.heapSort(arr);

       System.out.println("After Sorting");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    } 
    
}

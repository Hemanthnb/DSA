package dsa.Heap;
public class HeapsortAscendingOrder {

    int size;
    HeapsortAscendingOrder(int size){
        this.size=size;
    }
    public void swap(int arr[],int indx1,int indx2){
        int temp=arr[indx1];
        arr[indx1]=arr[indx2];
        arr[indx2]=temp;
        
    }
    public void heapify(int newArray[],int indx){
        int largest=indx;
        while (largest<size) {
            int l=(2*indx)+1;
            int r=(2*indx)+2;
            if(l<size&&newArray[largest]<newArray[l])
                largest=l;
            if(r<size&&newArray[largest]<newArray[r])
                largest=r;
            if(largest!=indx){
                swap(newArray,indx, largest);
                indx=largest;
            }
            else{
                break;
            }
            
        }


    }
    public void heapSort(int arr[]){
        while(size>0){
            swap(arr,0,--size);
            heapify(arr,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,2,3,1,5,7,0,-1};
        HeapsortAscendingOrder sort=new HeapsortAscendingOrder(arr.length);
          int i=(arr.length/2)-1;
        while (i>=0) {
            sort.heapify(arr, i);
            i--;
        }

        System.out.println("Implemented Max Heap");
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println("\n----------------------------------");
                System.out.println("After sorting");
                sort.heapSort(arr);
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j]+" ");
                }
        


    }
    
}

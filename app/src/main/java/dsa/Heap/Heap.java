package dsa.Heap;
class MaxHeap{
    int arr[];
    int size;
    int index;
    MaxHeap(int size){
        this.index=0;
        this.size=size;
        this.arr=new int[this.size];
    }

    void swap(int arr[],int indx1,int indx2){
        int temp=arr[indx1];
        arr[indx1]=arr[indx2];
        arr[indx2]=temp;
    }

    void insert(int data){
        int indx=this.index;
        arr[indx]=data;
            while(indx>0){
                if(arr[indx]>arr[((indx-1)/2)]){
                    swap(arr,indx,((indx-1)/2));
                    indx=((indx-1)/2);
                }
                else{
                    break;
                }
            }
        this.index++;
    }

    void print(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }

    
}



class MinHeap{
    int arr[];
    int size;
    int index;
    MinHeap(int size){
        this.arr=new int[size];
        this.size=size;
        this.index=0;
    }

    void swap(int arr[],int iter1, int iter2){
        int temp=arr[iter1];
        arr[iter1]=arr[iter2];
        arr[iter2]=temp;
    }

    void insert(int val){
        if(index<size){

            arr[index]=val;
            int i=index;
            while (i>0) {
                if(arr[i]<arr[(i-1)/2]){
                swap(arr, i, (i-1)/2);
                i=(i-1)/2;
            }
            else{
                break;
            }
        }
        for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();

        index++;
    }
    }

}
public class Heap {
    public static void main(String[] args) {

        //MAXHEAP


        // int newArray[]={1,2,3,4,5,6,7,8};
        // MaxHeap maxHeap=new MaxHeap(newArray.length);
        // for (int i = 0; i < newArray.length; i++) {
        //     maxHeap.insert(newArray[i]);
        // }
        // maxHeap.print();
        // System.out.println("----------------");
        // maxHeap.delete();
        // // maxHeap.delete();
        // maxHeap.print();
        // System.out.println("After Deletion");
        // maxHeap.print(maxHeap.arr);
        // int i=(newArray.length/2)-1;
        // while (i>=0) {
            //     maxHeap.heapify(i,newArray);
            //     i--;
            // }
            // maxHeap.print(newArray);
            


        //MINHEAP

        // int minArr[]={55,54,53,52,50};


        // MinHeap heap = new MinHeap(5);
        // for (int i = 0; i < minArr.length; i++) {
        //     heap.insert(minArr[i]);
        // }

        // for (int i = 0; i < minArr.length; i++) {
        //     System.out.print(heap.arr[i]+" ");
        // }
        
        }


    
}

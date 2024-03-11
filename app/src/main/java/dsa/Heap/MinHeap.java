package dsa.Heap;

class MinHeap {
    int arr[];
    int size;
    int index;

    MinHeap(int size) {
        this.index = 0;
        this.size = size;
        this.arr = new int[this.size];
    }

    void swap(int arr[], int indx1, int indx2) {
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
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

        index++;
    }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int minArr[] = { 55, 54, 53, 52, 50 };

        MinHeap heap = new MinHeap(5);
        for (int i = 0; i < minArr.length; i++) {
            heap.insert(minArr[i]);
        }

        for (int i = 0; i < minArr.length; i++) {
            System.out.print(heap.arr[i] + " ");
        }

    }

}

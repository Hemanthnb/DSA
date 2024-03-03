public class TryCatch {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        try{
        for (int i = 0; i <=arr.length; i++) {
            if(i==arr.length){
                throw new ArrayIndexOutOfBoundsException("value of I should be less than size if array");
            }
            System.out.print(arr[i]+" ");
        }
    }catch(Exception e){
        
    }
    }
    
}

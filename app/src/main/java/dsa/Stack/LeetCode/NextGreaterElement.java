package dsa.Stack.LeetCode;
import java.util.*;;
public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[]={1,3,4,2};
        // output {3,4,-1,-1};
        Stack<Integer>stk=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int i=arr.length-1;
        while (i>=0) {
            if(stk.isEmpty()){
                ans.add(-1);
                stk.add(arr[i]);
            }
            else{
                if(arr[i]<stk.peek()){
                    ans.add(stk.peek());
                    stk.push(arr[i]);
                }
                else{
                    stk.pop();
                    continue;
                }
            }
            i--;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
    
}

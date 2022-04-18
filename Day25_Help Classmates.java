class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()){
            if (i == '{' || i == '[' || i == '(') stack.push(i);
            else {
                if (stack.empty()) return false;
                else{class Solution {
public static int[] help_classmate(int arr[], int n) 
{ 
    int ans[]=new int[n];
    int i=0;
    int k=i;
    int j=0;
    Stack<Integer> stack=new Stack<Integer>();
    stack.push(arr[i]);
    while(i<n-1)
    {
        if(arr[k]>=stack.peek() && k<n-1)
        {
            k++;
        }
        else if(arr[k]<stack.peek())
        {
            ans[j]=arr[k];
            i++;
            stack.push(arr[i]);
            j++;
            k=i;
        }
        else if(k==n-1 && arr[k]>=stack.peek())
        {
            ans[j]=-1;
            i++;
            stack.push(arr[i]);
            j++;
            k=i;
        }
    }
    ans[n-1]=-1;
    return ans;
} 
}
                    if (i == '}' && stack.peek() == '{'){
                        stack.pop();
                    }else if (i == ']' && stack.peek() == '['){
                        stack.pop();
                    }else if (i == ')' && stack.peek() == '('){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
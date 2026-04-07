import java.util.*;
import java.util.LinkedList;

class TreeNode{
    int node;
    TreeNode right;
    TreeNode left;

    TreeNode(int data){
        node = data;
        left = right = null;
    }
}

public class ReImplement {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        TreeNode root = new TreeNode(arr[0]); 

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int i = 1;

        while(i < n && !q.isEmpty()){
            TreeNode val = q.poll();

            if(arr[i] != -1){
                val.left = new TreeNode(arr[i]);
                q.add(val.left);
               
            }

            i += 1;
            if(i < n && arr[i] != -1){
                val.right = new TreeNode(arr[i]);
                q.add(val.right);
            }

            i += 1;
        }

        input.close();

    }
}

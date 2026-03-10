import java.util.*;

class TreeNode{
    int node;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        node = data;
        left = right = null;
    }

}
public class Implementation {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        //Considering -1 to indicate null values
        TreeNode root = new TreeNode(arr[0]);

        ArrayDeque<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        int i = 1;

        while(!q.isEmpty()){
            TreeNode curr = q.poll();

            if(i < n && arr[i] != -1){
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
                
            }

            i += 1;

           if(i < n && arr[i] != -1){
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right); 
            }

            i += 1;

        }

        q.clear();

        q.add(root);
        ArrayList<ArrayList<TreeNode>> list = new ArrayList<>();

        while(!q.isEmpty()){
            int len = q.size();
            ArrayList<TreeNode> res = new ArrayList<>();
            
            for(int k = 0; k<len; k++){
                TreeNode curr = q.poll();
                res.add(curr);

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }

            }

            list.add(new ArrayList<>(res));

        }

        for(int l = 0; l<list.size(); l++){
            System.out.println(l + 1 + " " + "order");

            for(int j = 0; j<list.get(l).size(); j++){
                System.out.print(list.get(l).get(j).node + " ");
            }

            System.out.println();

        }

        

        input.close();

    }
}

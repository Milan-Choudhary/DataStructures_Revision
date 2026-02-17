import java.util.*;


public class Binary_Tree {

    public class Pair{
        int data;
        Pair left;;
        Pair right;

        Pair(int data){
            this.data = data;
            this.left = this.right = null;
        }
    
    public class Binary_Tree1{
        Pair root;

        public void Add(int data){
            Pair temp = new Pair(data);

            if(root == null){
                temp = root;
                temp.left = null;
                temp.right = null;
                return;
            }

            if(root.left == null){
                root.left = temp;
                root
            }
            else{
                root.right = temp;
            }
        }

    }


    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        



        input.close();
    }

}

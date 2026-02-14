//Revising the concept in the late of January

package OOPs;

public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListImpl{
        Node head;

        public void insertAtBeginning(int data){
        Node temp = new Node(data);

        temp.next = head;
        head = temp;
        }

        public void Print(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + "->" + " ");
                temp = temp.next;
            }
            
            System.out.println();

        }

        public void insertAtLast(int data){

            Node temp = new Node(data);

            Node curr = head;
            if(head == null){
                head = temp;
                return;
            }   

            while(curr.next != null){
                curr = curr.next;
            }

            curr.next = temp;           

        }

        public int Middle(){
            Node slow = head;
            Node fast = head;
            
            while(fast != null  && fast.next != null){

                fast = fast.next.next;
                slow = slow.next; 
            }

            return slow.data;

        }

        public boolean isCyclic(){

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(slow == fast){
                    return true;
                }
            }

            return false;

        }

        public Node reverseList(Node head2){
            Node curr = head2;
            Node prev = null;


            while(curr != null){
                Node nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;

            }

            // head2 = prev;
            // return head2;
            return prev;


        }


    }
    


        public static void main(String[] args) {
            LinkedListImpl list = new LinkedListImpl();

            for(int i = 1; i<=12; i++){
                list.insertAtLast(i);
            }

            list.Print();

            System.out.println(list.Middle());

            System.out.println(list.isCyclic());

            Node root = list.reverseList(list.head); 

            while(root != null){
                System.out.print(root.data + " ");
                root = root.next;
            }


    }
}

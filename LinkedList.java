// Revising the concept in the mid of November
class LinkedList{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class linkedlist{
        Node head;

        public void insertAtBeginning(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }

        public void Print(){
            Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data + "->" + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
           // System.out.println(temp.next.data);
        }

        public void insertAtLast(int data){
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                return;
            }

            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;

        }


        public int Middle(){
            Node temp = head;

            Node slow = temp;
            Node fast = temp;

            while(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow.data;
        }

        public boolean isCyclic(){
            Node temp = head;

            Node slow = temp;
            Node fast = temp;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    return true;
                }
            }

            return false;
        }

        public void reverseList(){
            Node curr = head;
            Node next;
            Node prev = null;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;
        }

        public void insertAtPosition(int pos,int val){
            Node temp = head;
            Node curr = new Node(val);
            int p = 1;

            while(temp != null && p != pos){
                temp = temp.next;
                p += 1;
            }

            if(temp == null){
                temp = curr;
            }
            else{
                curr.next = temp.next;
                temp.next = curr;
                // temp.next = curr;
                // curr.next = temp.next.next;
            }



        }

    }



    public static void main(String[] args){

        linkedlist list = new linkedlist();

        for(int i = 2; i<=24; i++){
            list.insertAtLast(i);
        }

        list.insertAtBeginning(1);
        list.Print();      

        System.out.println(list.Middle());
        System.out.println(list.isCyclic());

        list.reverseList();
        list.Print();  

        list.insertAtPosition(4, 100);

        list.Print();




    }


}
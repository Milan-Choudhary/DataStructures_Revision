// Revising the concept in the mid of November
 //Linked List is a linear data structure where each element is a separate object, called a node. Each node contains two parts: data and a reference to the next node in the list.

            //Advantages of Linked Lists:
            //1. Dynamic Size: Linked lists can grow or shrink in size during runtime, which allows for efficient memory usage.
            //2. Ease of Insertion/Deletion: Inserting or deleting nodes in a linked list is easier compared to arrays, as it does not require shifting elements.
            //3. No Wasted Space: Linked lists do not require contiguous memory allocation, which can lead to better utilization of memory.

            //Disadvantages of Linked Lists:
            //1. Memory Overhead: Each node in a linked list requires additional memory for storing the reference to the next node, which can lead to increased memory usage compared to arrays.
            //2. Sequential Access: Linked lists do not allow random access to elements, meaning that you have to traverse the list from the beginning to access a specific element, which can be inefficient for large lists.
            //3. Cache Performance: Due to non-contiguous memory allocation, linked lists may have poor cache performance compared to arrays, which can lead to slower access times.

class LinkedList{

    static class Node{ // A nested class representing a node in the linked list
        int data; // The data stored in the node
        Node next; // A reference to the next node in the list

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class linkedlist{
        Node head; // The head of the linked list, which points to the first node in the list

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
            int p = 2;

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

        linkedlist list = new linkedlist(); // Creating an instance of the linked list

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
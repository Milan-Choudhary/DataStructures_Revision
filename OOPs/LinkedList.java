//Revising the concept in the late of January

package OOPs;

public class LinkedList {
    private Node head;

    private class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = temp;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void deleteNode(int data) {
        if (head == null) {
            return;
        }

        if (head.val == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.val != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }


    public void Reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }




    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.printList();
        list.insertAtBeginning(5);
        list.printList();
        list.deleteNode(10);
        list.printList();

    }
}

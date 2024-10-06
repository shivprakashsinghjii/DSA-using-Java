class LinkedList {
    Node head; // Head of the list

    // Method to add a node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move prev and current one step forward
            current = next;
        }
        head = prev; // Update the head to the new first element
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Linked List:");
        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Reversing the linked list
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.display(); // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}

public class LinkedList {

	private Node head;
	//private Node tail;

	public LinkedList() {
		this.head = null;
	}

	public void addAtHead(int data) {

		//create a new node to store the data
		Node newNode = new Node(data);

		//new node refers to the old head
		newNode.setNext(this.head);

		//move head so that it refers to the new node
		this.head = newNode;

	}

	public void printList() {

		// System.out.println(head.getData());
		// head.getNext()

		Node current = head;

		while(current != null) {
			//print data
			System.out.println(current.getData());

			//advance
			current = current.getNext();
		}



	}



}
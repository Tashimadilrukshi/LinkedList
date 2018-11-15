class Node{
	int value;
	Node next;
	
	public Node(){
		next = null;
	}
	
	pblic Node(int value){
		next = null;
	}
}

public class LinkedList{
	Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public void insert(int data){
		Node n = new Node(data);
		if (head == null){
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}
		
	public Node findNode(int key){
		Node temp_node = head;
		boolean result = null;
		while (temp_node != null){
			if (temp_node.value == key){
				result = temp_node;
				break;
			}
			temp_node = temp_node.next;
		}
		return result;
	}
	
	public void printValues(){
		Node temp_node = head;
		while (temp_node != null){
			System.out.println(temp_node.value);
			temp_node = temp_node.next;
		}
	
	}
	

}


public class TTTRecordLinkedList{
	TTTRecordNode front;
	TTTRecordNode rear;
	int size=0;
	
	public TTTRecordLinkedList(TTTRecordNode first){
		front=first;
		rear=first;
		size=1;
	}

	public TTTRecordNode getFront() {
		return front;
	}

	public void setFront(TTTRecordNode front) {
		this.front = front;
	}

	public TTTRecordNode getRear() {
		return rear;
	}

	public void setRear(TTTRecordNode rear) {
		this.rear = rear;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void add(TTTRecordNode newNode){
		if(size==0){
			front=newNode;
			rear=newNode;
		}
		else if(size==1){
			front.setPrev(newNode);
			rear=newNode;
			rear.setNext(front);
		}
		else{
			rear.setPrev(newNode);
			newNode.setNext(rear);
			rear=newNode;
		}
		size++;
	}
	
	public void remove(String delete){
		TTTRecordNode current=front;
		while(current!=null && current.getElement().getConfiguration()!=delete){
			current=current.getNext();
		}
		if(exists(delete)) {
			current.getNext().setPrev(current.getPrev());
			current.getPrev().setNext(current.getNext());
			size--;
		}
	}
	
	public boolean exists(String target){
		TTTRecordNode current=front;
		while(current!=null && current.getElement().getConfiguration()!=target){
			current=current.getNext();
		}
		if (current==null){
			return false;
		}
		else {
			return true;
		}
	}
	public TTTRecord find(String target){
		TTTRecordNode current=front;
		while(current!=null && current.getElement().getConfiguration()!=target){
			current=current.getNext();
		}
		if(current== null){
			return null;
		}
		return current.getElement();
		
	}
}

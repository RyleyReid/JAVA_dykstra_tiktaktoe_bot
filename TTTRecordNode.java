public class TTTRecordNode {
	TTTRecordNode next;
	TTTRecordNode prev;
	TTTRecord element;
	
	public TTTRecordNode(TTTRecord object){
		TTTRecordNode next=null;
		TTTRecordNode prev=null;
		TTTRecord element=object;
	}

	public TTTRecordNode getNext() {
		return next;
	}

	public void setNext(TTTRecordNode next) {
		this.next = next;
	}

	public TTTRecordNode getPrev() {
		return prev;
	}

	public void setPrev(TTTRecordNode prev) {
		this.prev = prev;
	}

	public TTTRecord getElement() {
		return element;
	}

	public void setElement(TTTRecord element) {
		this.element = element;
	}
	

}

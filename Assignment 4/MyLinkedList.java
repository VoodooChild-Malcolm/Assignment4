public class MyLinkedList<E>  {
  private Node<E> head, tail;
  private int size = 0;
 
  public MyLinkedList() {
     head = null;
	 tail = null;
  }

  /** Return the head element in the list */
  public E getFirst() {
    //size++;
    if (head == null) {
      return null;
    }
    else {
      return head.element;
    }
  }

  /** Return the last element in the list */
  public E getLast() {
    //size++;
    if (head==null) {
      return null;
    }
    else {
      return tail.element;
    }
  }

  /** Add an element to the beginning of the list */
  public void prepend(E e) {
    Node<E> newNode = new Node<>(e); // Create a new node
    newNode.next = head; // link the new node with the head
    head = newNode; // head points to the new node
   
    if (tail == null) // the new node is the only node in list
      tail = head;
	size++;
  }

  /** Add an element to the end of the list */
  public void append(E item) {
	Node<E> newNode = new Node<>(item); // Create a new for element e

    if (head == null) {
      head = tail = newNode; // The new node is the only node in list
    }
    else {
      tail.next = newNode; // Link the new with the last node
      tail = newNode; // tail now points to the last node
    }
    size++;
  }

  
  /** Remove the head node and
   *  return the object that is contained in the removed node. */
  public E removeFirst() {
    if (head == null) {
      return null;
    }
    else {
      E temp = head.element;
      head = head.next;
      if (head == null) {
        tail = null;
      }
      size--;
      return temp;

    }

  }
  public E removeCurrent(E obj) {


    if (head == null) {
      return null;
    }
    Node<E> previousNode = head;
    Node<E> currentNode = head.next;

    if (head.element.equals(obj)) {
      E temp = head.element;
      head = head.next;
      return temp;
    }

    while (currentNode != null) {
        if (currentNode.element.equals(obj)) {
          E temp = currentNode.element;
          previousNode.next = currentNode.next;
          return temp;
        }
      previousNode = currentNode;
      currentNode = currentNode.next;

    }

    return null;
  }


  public int getSize() {
    return size;
  }

  public String toString() {
    String result = "[";

    Node<E> ptr = head;
    for (ptr= head;ptr!=null; ptr=ptr.next) 
	{
		 result = result + ptr.element.toString();
		 if (ptr.next != null)
             result = result + ","; // add commas but not to the final 1   
	}
    result += "]"; // Insert the closing ] in the string
    return result;
  }


  public void clear() {
     head = tail = null;
  }


  private static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
	  next = null;
    }
  }

  //Comparison method
  public boolean contains(E obj) {
    Node<E> currentNode = head; // Start at the head of the list

    while (currentNode != null) {
      E currentElement = currentNode.element;

      // Compare the current element with the target element
      if (currentElement.equals(obj)) {
        return true; // Found a match
      }

      // Move to the next node
      currentNode = currentNode.next;
    }

    // The target element was not found in the list
    return false;
  }


} // end myLinkedList class


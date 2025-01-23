import java.util.LinkedList;

public class CISQueue {
  // LinkedList internal representation of Queue.
  private LinkedList<Object> list;

  // Size property.
  private int size = 0;

  // Constructor (initialize properties)
  public CISQueue() {
    list = new LinkedList<>();
  }

  // Enqueue. This method adds a node to the end of the linked list.
  public void enqueue(Object value) {
    size++;
    list.addLast(value);
  }

  // Dequeue. This method removes a node from the beginning of the linked list.
  public Object dequeue() {
    if (isEmpty()) { // Return null if Queue is empty.
      return null;
    }

    // Decrement size count and remove first element
    size--;
    return list.removeFirst();
  }

  // isEmpty. Returns a boolean indicating whether the linked list is empty.
  public boolean isEmpty() {
    return size == 0;
  }

  // size. Returns the size of the queue.
  public int size() {
    return size;
  }

  // toString. Returns a description of the queue in, for example, the following format:
  // CISQueue{queue=[7, 11], size=2}
  @Override
  public String toString() {
    String result = "CISQueue{queue=[";

    for (int i = 0; i < size; i++) {
      result += list.get(i) + (i == size - 1 ? "" : ", ");
    }

    result += "], size=" + size + "}";
    return result;
  }
}

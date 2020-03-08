public class Queue<T> implements QueueInterface<T> {

  private Node<T> first;
  private Node<T> last;

  public Queue() {
    first = new Node<>(null);
    last = new Node<>(null);
    first.setNext(last);
  }

  public boolean isEmpty() {
    return first.getNext().equals(last);
  }

  //post: Adds the given item to the queue
  public void enqueue(T item) {
    Node<T> node = new Node<>(item);
    Node<T> pred, curr;
    curr = first;
    do {
      pred = curr;
      curr = pred.getNext();
    } while (!curr.equals(last));
    node.setNext(curr);
    pred.setNext(node);
  }

  //post: Removes and returns the head of the queue. It throws an
  //      exception if the queue is empty.
  public T dequeue() throws QueueException {
    if (isEmpty()) {
      throw new QueueException("Empty List");
    }
    Node<T> pred, curr;
    pred = first;
    curr = first.getNext();
    T item = curr.getItem();
    pred.setNext(curr.getNext());
    return item;
  }

}

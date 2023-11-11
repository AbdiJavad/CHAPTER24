
public class MyLinkedList<E> implements MyList<E> {

    private Node<E> head, tail;

    private int size = 0;


    public MyLinkedList() {

    }

    public MyLinkedList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);

    }

    public E getFirst() {
        if (size == 0) {
            return null;

        } else {


        }

        return null;
    }


    public E getLast() {
        if (size == 0) {
            return null;

        } else {
            return tail.element;

        }

    }


    public void addFirst(E e) {

    }

    public void addLast(E e) {

    }

    @Override

    public void add(int index, E e) {

    }

    public E removeFirst() {

        return null;
    }

    public E removeLast() {

        return null;
    }

    @Override


    public E remove(int index) {

        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");

            } else {
                result.append("]");

            }

        }

        return result.toString();

    }

    @Override


    public void clear() {
        size = 0;
        head = tail = null;

    }

    @Override


    public boolean contains(Object e) {
        return true;

    }

    @Override


    public E get(int index) {

        return null;

    }

    @Override

    public int indexOf(Object e) {

        return 0;

    }

    @Override


    public int lastIndexOf(E e) {

        return 0;

    }

    @Override
    public E set(int index, E e) {
        return null;

    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();

    }

    private class LinkedListIterator
            implements java.util.Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return (current != null);

        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {

        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    @Override
    public int size() {
        return size;
    }
}
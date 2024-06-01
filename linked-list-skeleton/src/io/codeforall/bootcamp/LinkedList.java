package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element // parameter of index
     * @return the element
     */
    public Object get(int index) {
        //get element by index;
        //I need to iterate the index;
        // index is an int
        //find the element: DATA!
        //return

        Node iterator = head; // becomes the head
        int counter = 0;

        while (iterator.getNext()!=null) {
            if (counter == index) {
                return iterator.getNext().getData();
            }
                    iterator = iterator.getNext(); //saves the ref in the iterator for the getNext
                   counter++;
        }
        return null;

    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {
        //search for data
        //returns the index of data

        Node iterator = head;
        int index = 0;
        //object


       while (iterator.getNext()!= null) {
           if (iterator.getNext().getData().equals(data)) { // this is used to data = data: to make sure the data is the data I want
               return index; // because I need the index of the data
           }
           iterator = iterator.getNext();
           index++;
       }
        return -1;

    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {
        //getData()
        //setNext(Node next)

        Node iterator = head;


        while (iterator.getNext()!= null){

            if(iterator.getNext().getData().equals(data)){//to compare the data that I want to remove

                iterator.setNext(iterator.getNext().getNext());

                length--;// to short the size of the list;

                return true;
            }
            iterator = iterator.getNext();
        }

        return false;




    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}

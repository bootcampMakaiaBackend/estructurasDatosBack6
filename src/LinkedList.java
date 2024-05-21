public class LinkedList {
    // un nodo []->
    class Node {
        int value;
        Node next = null;
        Node(int value) {
            this.value = value;
        }
    }
    //Head
    protected Node head = null;
    //Tail
    protected Node tail = null;

    //[8] -> head > tail
    //[7] -> [8]
    //head    tail
    public void addHead(int value){
        Node newNode = new Node(value);
        newNode.next = head; //null
        head = newNode;
        //que pasa cuandola lista esta vacia?
        if(newNode.next == null){
            tail=newNode;
        }
    }

    public void addTail(int valor){

    }

    public void addByPosition(int index, int value){

    }
}

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
    //[valor] next -> [valor]


    //[5] ->  [8] -> [9] ->null
    //head          tail
    public void addHead(int value){
        Node newNode = new Node(value);  //[5] .next -> null
        newNode.next = head; // [5] .next -> [8]
        head = newNode; // [5] -> head
        //que pasa cuandola lista esta vacia?
        if(newNode.next == null){
            tail=newNode;
        }
    }
    //9
    //[9]
    //[10] -> [19] -> [0] ->[100]
    //head            tail
    public void addTail(int value) {
        Node newNode = new Node(value); //[9] .next -> null
        if(tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // index - > 2 el valor 6
    //[5] ->  [8] ->  [6] ->  [9]  -> [78] -> [123] -> [70] -> [800]
    public void addByPosition(int index, int value) {
        if(index == 0) {
            addHead(value);
        } else if (index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Node newNode = new Node(value);
            Node current = head;
        }
    }

    public void deleteByPosition(int index, int value) {

    }

    public void delete() {

    }

    public Node getNodeByIndex(int index) {
        return null;
    }

    public int getValueByIndex(int index) {
        return 0;
    }
}

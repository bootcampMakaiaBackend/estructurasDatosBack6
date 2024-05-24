package colas;

import java.util.LinkedList;

public class Queue {

    private LinkedList linkedList;

    public Queue() {
        this.linkedList = new LinkedList();
    }
    
    //agregar al final de la cola.
    public void agregar(Object o) {
        linkedList.add(o);
    }

    //procesar
    public Object procesar(){
        if(linkedList.isEmpty()){
            return null;
        }
        return linkedList.removeFirst();
        //cajero =  [juan]-> [Ana]
        //          front  rear
    }


}

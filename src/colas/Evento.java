package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    private Queue<Integer> tiquetes;
    private int capacidadDisponible;

    public Evento(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
        this.tiquetes = new LinkedList<>();
    }

    public void agregarTiquetes(int numeroTiquetes){
        this.tiquetes.add(numeroTiquetes);
    }

    public void procesarHastaAgotarDisponibilidad(){
        int tiquetesRestantes = 0;
        while(capacidadDisponible > 0) {
            //[10] [20] [5]
            //tiquetes.peek -> front 10
            //remove -> retornar el fron 10  // [20] [5]
            tiquetesRestantes = capacidadDisponible - tiquetes.peek();
            if(tiquetesRestantes >= 0){
                this.capacidadDisponible = this.capacidadDisponible - tiquetes.remove();
            }
        }
    }

}

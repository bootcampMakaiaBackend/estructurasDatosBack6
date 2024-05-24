package colas;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento(100);
        evento.agregarTiquetes(10); // 1
        evento.agregarTiquetes(50); //2
        evento.agregarTiquetes(90); //3
        evento.agregarTiquetes(5); //4
        evento.procesarHastaAgotarDisponibilidad();

    }
}

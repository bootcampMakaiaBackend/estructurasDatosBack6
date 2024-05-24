package pilas;

import java.util.Stack;

public class EditorTexto {
    private Stack<String> letras;

    public EditorTexto(){
        this.letras = new Stack<>();
    }

    public void agregarLetra(String letra){
        this.letras.push(letra);
    }

    private boolean puedoDesHacer(){
        return !this.letras.isEmpty();
    }

    public String desHacer(){
        if(puedoDesHacer()){
            return this.letras.pop();
        }
        return null;
    }

    public void imprimir(){
        for (String letra: letras) {
            System.out.println(letra);
        }
    }


}

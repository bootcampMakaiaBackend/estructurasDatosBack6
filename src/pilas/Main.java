package pilas;

public class Main {
    public static void main(String[] args) {
        EditorTexto editorTexto =  new EditorTexto();
        editorTexto.agregarLetra("MAAA");
        editorTexto.agregarLetra("Tote");
        editorTexto.agregarLetra("Zzap");
        //
        editorTexto.imprimir();
    }

}

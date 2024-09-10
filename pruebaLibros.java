
public class pruebaLibros {

    public static void main(String[] args) {
      /*  libroTexto libroTexto1 = new libroTexto("Intitucion Universitaria Antonio Jose Camacho", "Hola");
        libroTexto1.setPropietario("Andres Hurtado/Camilo Fernadez Astaiza");
        libroTexto1.setCurso("Programacion");
        libroTexto1.setPrecio(10000.0);
        libroTexto1.imprimir();

        libroTexto libroTexto2 = new libroTexto("Yo", "Programar");
        libroTexto2.setPropietario("Andres Hurtado/Camilo Fernadez Astaiza");
        libroTexto2.setCurso("Programacion");
        libroTexto2.setPrecio(100000.0);
        libroTexto2.imprimir();
        */
        libroInstitucion libroInstitucion1 = new libroInstitucion("Intitucion Universitaria Antonio Jose Camacho", "Programacion");
        libroInstitucion1.imprimir();
        libroNovela libroNovela1 = new libroNovela("Da vinci","El codigo Da vinci");
        libroNovela1.imprimir();
    }
}
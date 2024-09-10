
public class libroTexto extends Libro {
    public String curso;
    public Double precio ;

    public libroTexto(String autor, String titulo) {
        super(autor, titulo);

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



    }


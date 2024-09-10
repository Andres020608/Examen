public class Libro {
    public String titulo;
    public String autor;
    public String propietario;
    public Double precio = 250000.0;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void imprimir() {
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El precio es " + precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getPropietario() {
        return propietario;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;

    }

}

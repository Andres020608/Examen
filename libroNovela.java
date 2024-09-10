public class libroNovela extends libroTexto {
    public String tipoNovela;
        public libroNovela(String autor, String titulo){
            super(autor, titulo);
            this.tipoNovela = tipoNovela;
        }
    public String getTipoNovela() {
        return tipoNovela;
    }
    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }
public void imprimir(){
    super.imprimir();
    getTitulo();
    setPropietario("Andres Hurtado/Camilo Fernandez Astaiza");
    setPrecio(1000000.0);
    setTipoNovela("Ficcion");
    System.out.println("\nEl titulo es: "+getTitulo()+"\n El autor es: "+getAutor()+"\n El precio es: "+getPrecio()+"\n El propietario es: "+getPropietario()+"\nEl tipo de novela es: "+getTipoNovela());

}
}


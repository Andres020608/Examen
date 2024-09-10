public class libroInstitucion extends libroTexto {
    public String facultad;
    public libroInstitucion(String autor,String Titulo){
    super(autor,Titulo);
}


public String getFacultad() {
    return facultad;
}

public void setFacultad(String facultad) {
    this.facultad = facultad;
}

public void imprimir(){
    setFacultad("Facultad de ingenieria");
    setPrecio(250000.0);
    setCurso("Programacion 2");
    setPropietario("\"Andres Hurtado/Camilo Fernandez Astaiza\"");
    setAutor("Profesor");
    System.out.println("\nEl titulo es: "+getTitulo()+"\n El autor es: "+getAutor()+"\n La facultad es: "+getFacultad()+"\n El curso es :"+getCurso() +"\n El precio es: "+getPrecio()+"\n El propietario es: "+getPropietario());

}

}


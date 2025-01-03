package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina * 2;
    }

    public String toString(){
        String mensaje = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.co_autor + "\n" + this.editorial + "\n" + this.edicion;
        return mensaje;
    }

    public String getCo_autor() {
      return this.co_autor;
    }
    public void setCo_autor(String value) {
      this.co_autor = value;
    }

    public String getEditorial() {
      return this.editorial;
    }
    public void setEditorial(String value) {
      this.editorial = value;
    }

    public String getEdicion() {
      return this.edicion;
    }
    public void setEdicion(String value) {
      this.edicion = value;
    }

    public String getInterpretacion() {
      return this.interpretacion;
    }
    public void setInterpretacion(String value) {
      this.interpretacion = value;
    }
}

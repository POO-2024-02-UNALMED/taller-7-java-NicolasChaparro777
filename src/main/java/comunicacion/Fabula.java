package comunicacion;

public class Fabula extends Escrito{
    private String enseñanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.enseñanzas = enseñanzas;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina * 1;
    }

    public String toString(){
        String mensaje = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.enseñanzas;
        return mensaje;
    }

    public String getEnsenanza() {
      return this.enseñanzas;
    }
    public void setEnseñanzas(String value) {
      this.enseñanzas = value;
    }

    public String getInterpretacion() {
      return this.interpretacion;
    }
    public void setInterpretacion(String value) {
      this.interpretacion = value;
    }
}

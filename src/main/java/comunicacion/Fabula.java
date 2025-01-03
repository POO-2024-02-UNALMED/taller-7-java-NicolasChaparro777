package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina * 1;
    }

    public String toString(){
        String mensaje = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanzas;
        return mensaje;
    }

    public String getEnsenanza() {
      return this.ensenanzas;
    }
    public void setEnsenanzas(String value) {
      this.ensenanzas = value;
    }

    public String getInterpretacion() {
      return this.interpretacion;
    }
    public void setInterpretacion(String value) {
      this.interpretacion = value;
    }
}

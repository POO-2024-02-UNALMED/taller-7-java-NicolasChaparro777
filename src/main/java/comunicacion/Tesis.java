package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina * 5;
    }

    public String toString(){
        String mensaje = this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.idea + "\n" + Tesis.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
        return mensaje;
    }

    public String getIdea() {
      return this.idea;
    }
    public void setIdea(String value) {
      this.idea = value;
    }

    public String[] getArgumentos() {
      return Tesis.argumentos;
    }
    public void setArgumentos(String[] value) {
      Tesis.argumentos = value;
    }

    public String getConclusion() {
      return this.conclusion;
    }
    public void setConclusion(String value) {
      this.conclusion = value;
    }

    public String getReferencias() {
      return this.referencias;
    }
    public void setReferencias(String value) {
      this.referencias = value;
    }

    public String getInterpretacion() {
      return this.interpretacion;
    }
    public void setInterpretacion(String value) {
      this.interpretacion = value;
    }
}

package comunicacion;
public class Alfabeto extends Pictograma {
    public static String[] letras;
    public String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString(){
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < Alfabeto.letras.length; i++){
            mensaje.append(Alfabeto.letras[i]);
            if (i != Alfabeto.letras.length - 1){
                mensaje.append(", ");
            }
        }
        return mensaje.toString();
    }

    public int cantidadLetras(){
        return Alfabeto.letras.length;
    }

    public String[] getLetras() {
      return Alfabeto.letras;
    }
    public void setLetras(String[] value) {
      Alfabeto.letras = value;
    }

    public String getInterpretacion() {
      return this.interpretacion;
    }
    public void setInterpretacion(String value) {
      this.interpretacion = value;
    }
}

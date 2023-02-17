package Data.ExtraHours;

/**
 * @author Pere Prior
 */

public class HorasExtra {

    String nif;
    String fecha;
    int hora_i;
    int hora_f;
    int sitio;

    public HorasExtra(String nif, String fecha, int hora_i, int hora_f,int sitio) {
        this.nif = nif;
        this.fecha = fecha;
        this.hora_i = hora_i;
        this.hora_f = hora_f;
        this.sitio = sitio;
    }

    @Override
    public String toString() {
        return "Data.ExtraHours.HorasExtra{" +
                "nif='" + nif + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora_i=" + hora_i +
                ", hora_f=" + hora_f +
                ", sitio=" + sitio +
                '}';
    }
}

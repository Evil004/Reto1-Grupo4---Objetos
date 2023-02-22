package Data.ExtraHours;

/**
 * @author Pere Prior
 */

public class ExtraHours {

    public ExtraHours(String nif, String date, int startHour, int endHour, int place) {
        this.nif = nif;
        this.date = date;
        this.startHour = startHour;
        this.endTime = endHour;
        this.place = place;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "NIF: " + nif + " Date: " + date + " Start Hour: " + startHour + " End Hour: " + endTime + " Place: " + place;
    }

    public int getStartTime() {
        return startHour;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getPlace() {
        return place;
    }

    public String getDate() {
        return date;
    }

    public String getNif() {
        return nif;
    }

    private String nif;
    private String date;
    private int startHour;
    private int endTime;
    private int place;
}

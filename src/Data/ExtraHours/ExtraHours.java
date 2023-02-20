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

    @Override
    public String toString() {
        return "Extra Hours: {" +
                "nif: '" + nif + '\'' +
                ", date: '" + date + '\'' +
                ", Start hour: " + startHour +
                ", End hour: " + endTime +
                ", Place: " + place +
                '}';
    }

    String nif;
    String date;
    int startHour;
    int endTime;
    int place;

}

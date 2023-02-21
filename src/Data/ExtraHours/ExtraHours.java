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

    String nif;
    String date;
    int startHour;
    int endTime;
    int place;

}

public class Event {
    public  String name;
    public  String date;
    public  String time;
    public  Club club;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Event(String name, String date, String time, Club club) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.club = club;
    }
}

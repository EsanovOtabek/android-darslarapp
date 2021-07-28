package uz.lifepc.iqtisodiyotaktdarslari;

public class Lessons {
    String title;
    String mavzu;

    public Lessons(String title, String mavzu) {
        this.title = title;
        this.mavzu = mavzu;
    }

    public String getTitle() {
        return title;
    }

    public String getMavzu() {
        return mavzu;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMavzu(String mavzu) {
        this.mavzu = mavzu;
    }
}

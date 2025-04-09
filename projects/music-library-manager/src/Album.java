import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Album {

    private String title;
    private int year;
    public Set<Song> songSet = new HashSet<>();
    Album(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

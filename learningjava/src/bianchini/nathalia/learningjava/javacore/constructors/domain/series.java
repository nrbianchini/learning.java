package bianchini.nathalia.learningjava.javacore.constructors.domain;

public class series {
    private String title;
    private String genre;
    private int seasons;
    private int yearRelease;
    private String channel;

    public series(String title, String genre, int seasons, int yearRelease) {
        this();
        this.title = title;
        this.genre = genre;
        this.seasons = seasons;
        this.yearRelease = yearRelease;
    }

    public series(String title, String genre, int seasons, int yearRelease, String channel) {
        // precisa ser a primeira linha do construtor
        this(title, genre, seasons, yearRelease);
        this.channel = channel;
    }

    public series() {
        System.out.println("dentro do construtor sem arg");
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Year released: " + yearRelease);
        System.out.println("Genre: " + genre);
        System.out.println("Seasons: " + seasons);
        System.out.println("Channel: " + channel);
    }
}

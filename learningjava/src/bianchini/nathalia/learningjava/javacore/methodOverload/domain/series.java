package bianchini.nathalia.learningjava.javacore.methodOverload.domain;

public class series {
    private String title;
    private String genre;
    private int seasons;
    private int yearRelease;

    public void init(String name, String genre, int seasons, int yearRelease) {
        this.title = name;
        this.genre = genre;
        this.seasons = seasons;
        this.yearRelease = yearRelease;
    }

    public void init(int seasons,int yearRelease) {
        this.seasons = seasons;
        this.yearRelease = yearRelease;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Year released: " + yearRelease);
        System.out.println("Genre: " + genre);
        System.out.println("Seasons: " + seasons);
    }
}

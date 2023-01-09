public class Film {

    private String title;
    private int releaseYear;
    private String genre;
    private double rate;

    public Film(String title, int releaseYear, String genre, double rate) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                ", rate=" + rate +
                '}';
    }
}

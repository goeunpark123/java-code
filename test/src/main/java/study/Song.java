package study;

public class Song {
    private String title;
    private String artist;
    private static String country;
    private int year;

    {
        System.out.println("초기화");
        year = 2024;
        country = "미국";
    }

    static {
        System.out.println("static 초기화");
        country = "대한민국";
    }

    public Song() {
    }

    public Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void play() {
        System.out.println("play " + this.title + " by " + this.artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}

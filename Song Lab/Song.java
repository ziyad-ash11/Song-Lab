public class Song {
    // artist_name;track_name;release_date;genre;len;shake the audience;obscene;danceability;loudness;topic
    private String artist, track, genre, topic;
    private int year, releaseDate, length;
    private double danceability, shake, obscene, loudness;

    public Song(String artist, String track, int releaseDate, String genre, int length, double shake, double obscene, double danceability, double loudness, String topic) {
        this.artist = artist;
        this.track = track;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.danceability = danceability;
        this.topic = topic;
        this.length = length;
        this.shake = shake;
        this.obscene = obscene;
        this.loudness = loudness;
    }
    public double getObscene() {
        return obscene;
    }
    public String getArtist() {
        return artist;
    }
    public double getDanceability() {
        return danceability;
    }
    public String getTitle() {
        return track;
    }

    public double getShake() {
        return shake;
    }

    public double getLoudness() {
        return loudness;
    }

    public int getYear() {
        return releaseDate;
    }

    public int getLen() {
        return length;
    }
}

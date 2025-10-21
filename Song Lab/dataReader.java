import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class dataReader {
    public Song[] read () {
        Scanner in;
        Song [] songs = new Song[28371];
        try {
            int num = 0;
            in = new Scanner(new File("songs 2025-2026 ANSI.csv"));
            in.nextLine();
            while(in.hasNext()) {
                String line = in.nextLine();
                int release_date = Integer.parseInt(line.split(";")[2]);
                String artist = line.split(";")[0];
                String track = line.split(";")[1];
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shake = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs[num] = new Song(artist, track, release_date, genre, length, shake, obscene, danceability, loudness, topic);

                num++;
            }
            System.out.println("Number of songs: " + num);

            in.close();
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
        return songs;
    }
    public int getLongestLen(Song [] list) {
        int longestLength = 0;
        for (int i = 0; i<28371; i++) {
            int length = list[i].getLen();
            if(length > longestLength) {
                longestLength = length;
            }
        }
        return longestLength;
    }
    public String getLowestShake(Song [] list) {
        double lowestShake = 1;
        String title = "";
        for (int i = 0; i<28371; i++) {
            double shake = list[i].getShake();
            if(shake < lowestShake) {
                lowestShake = shake;
                title = list[i].getTitle();
            }
        }
        return title;
    }
    public String getLoudestSong(Song [] list) {
        Double loudest = 0.0;
        String title = "";
        for (int i = 0; i<28371; i++) {
            Double loudness = list[i].getLoudness();

            if(loudness > loudest) {
                loudest = loudness;
                title = list[i].getTitle();
            }
        }
        return title;
    }
    public int getNumSongs1982(Song [] list) {
        int year1982 = 0;
        for (int i = 0; i<28371; i++) {
            int release_date = list[i].getYear();

            if (release_date == 1985) {
                year1982 = year1982 + 1;
            }
        }
        return year1982;
    }
    public int getNumSongs2000(Song [] list) {
        int year2000 = 0;
        for (int i = 0; i<28371; i++) {
            int release_date = list[i].getYear();

            if (release_date == 2000) {
                year2000 = year2000 + 1;
            }
        }
        return year2000;
    }
    public int getNumSongs2015(Song [] list) {
        int year2015 = 0;
        for (int i = 0; i<28371; i++) {
            int release_date = list[i].getYear();

            if (release_date == 2015) {
                year2015 = year2015 + 1;
            }
        }
        return year2015;
    }
    public int getDanceabilityRatings(Song [] list) {
        int numSongs = 0;
        for (int i = 0; i<28371; i++) {
            double danceability = list[i].getDanceability();
            if (danceability > 0.8) {
                numSongs = numSongs + 1;
            }
        }
        return numSongs;
    }
    public int getNumSongsMichaelJackson(Song [] list) {
        int numSongs = 0;
        for (int i = 0; i<28371; i++) {
            String artist = list[i].getArtist();
            if (artist.contains("michael jackson")) {
                numSongs = numSongs + 1;
            }
        }
        return numSongs;
    }
    public int getNumSongsWhitneyHouston(Song [] list) {
        int numSongs = 0;
        for (int i = 0; i<28371; i++) {
            String artist = list[i].getArtist();
            if (artist.contains("whitney houston")) {
                numSongs = numSongs + 1;
            }
        }
        return numSongs;
    }
    public double getAverageObscenityLevel19501959(Song [] list) {
        int numSongs = 0;
        double totalObsceneRating = 0;
        for (int i = 0; i<28371; i++) {
            double obscene = list[i].getObscene();
            int release_date = list[i].getYear();
            if (release_date >= 1950 && release_date <= 1959) {
                numSongs = numSongs + 1;
                totalObsceneRating = totalObsceneRating + obscene;
            }
        }
        return totalObsceneRating;
        
    }
}
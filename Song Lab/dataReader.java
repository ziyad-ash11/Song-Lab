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
                int duration = Integer.parseInt(line.split(";")[4]);
                double shake = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs[num] = new Song(artist, track, release_date, genre, duration, shake, obscene, danceability, loudness, topic);

                num++;
            }
            System.out.println("Number of songs: " + num);

            in.close();
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
        return songs;
    }
    public String getLongestTitle(Song [] List) {
        String longest = "";
        for (int i=0; i<28371; i++) {
            String title = List[i].getTitle();

            if(title.length() > longest.length()) {
                longest = title;
            }
        }
        
        return longest;  
    }
    public double getLowestShake(Song [] list) {
        double lowestShake = 1;
        for (int i = 0; i<28371; i++) {
            double shake = list[i].getShake();
            if(shake < lowestShake) {
                lowestShake = shake;
            }
        }

        return lowestShake;
    }
    public double getLoudestSong(Song [] list) {
        Double loudest = 0.0;
        for (int i = 0; i<28371; i++) {
            Double loudness = list[i].getLoudness();

            if(loudness > loudest) {
                loudest = loudness;
            }
        }

        return loudest;
    }
}
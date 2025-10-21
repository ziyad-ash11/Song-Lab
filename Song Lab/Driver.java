import java.util.List;

public class Driver{

    public static void main (String [] arg) {
        dataReader r= new dataReader();
        Song [] List = r.read();
        String lowestShake = r.getLowestShake(List);
        System.out.println("Lowest shake: " + lowestShake);
        String loudest = r.getLoudestSong(List);
        System.out.println("Loudest song: " + loudest);
        int release_date = r.getNumSongs1982(List);
        System.out.println("Number of songs in 1982: " + release_date);
        int length = r.getLongestLen(List);
        System.out.println("Largest length: " + length);
        int release_date2 = r.getNumSongs2000(List);
        System.out.println("Number of songs in 2000: " + release_date2);
        int release_date3 = r.getNumSongs2015(List);
        System.out.println("Number of songs in 2015: " + release_date3);
        int numSongs = r.getDanceabilityRatings(List);
        System.out.println("Number of songs with danceability rating > 0.8: " + numSongs);
        int numSongs1 = r.getNumSongsMichaelJackson(List);
        System.out.println("Number of songs with Michael Jackson: " + numSongs1);
        int numSongs2 = r.getNumSongsWhitneyHouston(List);
        System.out.println("Number of songs with Whitney Houston: " + numSongs2);
    }
} 
import java.util.List;

public class Driver{

    public static void main (String [] arg) {
        dataReader r= new dataReader();
        Song [] List = r.read();
        String longest = r.getLongestTitle(List);
        System.out.println("Longest song: " + longest);
        double lowestShake = r.getLowestShake(List);
        System.out.println("Lowest shake: " + lowestShake);
        double loudest = r.getLoudestSong(List);
        System.out.println("Loudest song: " + loudest);

    }
} 
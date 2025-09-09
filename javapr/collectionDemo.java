import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
public class collectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
        HashSet<String> songs = new HashSet<>();
        HashMap<String, Integer> phone = new HashMap<>();
        phone.put("ram",22222); 
        phone.put("ram",4444);
        System.out.println(phone.get("ram"));
        System.out.println(phone.containsKey("ram"));
        //Set<String> songs = new HAshSet<>();
        //songs = new LinkedHashSet<>(); - uppercasting
        //songs = newTreeSet<>();
        songs.add("Bang Bang");
        songs.add("Bang Bang");
        songs.add("Boom boom"); 
        System.out.println(songs);
        
    }   
}
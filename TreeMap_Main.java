import java.util.*;
public class Main {

    public static void main(String[] args) {

        int [] arr = {10 , 15 , 20,  25, 30, 35, 40, 45,50};
//        TreeMap<Integer, String > Tmap = new TreeMap<>((a,b)-> a>b ? -1 : a<b ? 1 : 0 );
        TreeMap<Integer, String > Tmap = new TreeMap<>(Collections.reverseOrder());
        Tmap.put(1, "Ramesh");
        Tmap.put(23, "Suresh");
        Tmap.put(7, "Mahesh");
        Tmap.put(11, "Rakesh");
        Tmap.put(34, "Dinesh");
        Tmap.put(19, "Rajesh");
        System.out.println(Tmap);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a>b ? -1 : a<b ? 1 : 0 );

    }

}

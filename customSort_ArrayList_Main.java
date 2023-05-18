import java.util.*;
public class Main {
    static  class Students implements Comparable<Students>{
        int marks;
        String name;
        Students(int marks,String name){
            this.marks=marks;
            this.name=name;
        }
        public int compareTo(Students other){
            if(this.marks==other.marks){
                return this.name.compareTo(other.name);
            }
            return other.marks-this.marks;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ArrayList<Students> arr = new ArrayList<>();

        arr.add(new Students(85,"Ankit"));
        arr.add(new Students(97,"Ravi"));
        arr.add(new Students(87,"Salman Ansari"));
        arr.add(new Students(94,"Prafull"));
        arr.add(new Students(82,"Kanak"));
        arr.add(new Students(90,"Priyanka"));
        arr.add(new Students(89,"Suraj"));
        arr.add(new Students(88,"Chadrasekhar"));
        arr.add(new Students(9,"Sohit"));
        arr.add(new Students(94,"Priya"));

        Collections.sort(arr);
        System.out.println(arr);
        int i=1;
        for(Students t : arr){
            System.out.println(t.name+"  "+  "Rank - " + i + "  " + "Marks - " + t.marks);
            i++;
        }
    }

}

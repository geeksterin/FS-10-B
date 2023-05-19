import java.util.*;
public class Main {
    abstract class Computer {
        abstract void work();
        void display() {
            System.out.println("I am a Computer");
        }
    }
    class Laptop extends Computer {
        void work() {
            System.out.println("I am working with Laptop");
        }
    }
    class Desktop extends Computer {
        void work() {
            System.out.println("I am working with Desktop");
        }
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

    }

}

import java.util.*;
public class Main {

    interface AmazonPay {
        final int a = 0;
        public void pay();
        public void reward();
        public void failedPayment();
    }
    static class Amazon implements  AmazonPay {
        public void pay() {
            System.out.println("Payment Successful");
        }
        public void reward() {
            System.out.println("Reward Successful");
        }
        public void failedPayment() {
            System.out.println("Failed Payments Fixed");
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Amazon amazon = new Amazon();
        amazon.pay();
        amazon.reward();
        amazon.failedPayment();
    }

}

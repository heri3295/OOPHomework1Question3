import java.util.Random;

public class RandomMonthGen {
    public static void main(String args[]){

        final String[] months = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"};

        Random randomGen = new Random();
        int randomNumber = (randomGen.nextInt(12) + 1);

        System.out.println("My number is " + randomNumber);
        System.out.print("My month is ");

        for (int i = 0; i <= 12; i++) {
            if (i == (randomNumber - 1)) { System.out.println(months[randomNumber - 1]); }
        }
    }
}

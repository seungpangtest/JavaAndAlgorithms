import java.util.Date;

public class Eight {
    public static void main(String[] args) {
        Date date = new Date();
        int currentHour = date.getHours();

        System.out.println("현재 시각은: " + date);
        if (currentHour < 11) {
            System.out.println("Good Morning!");
        } else{
            System.out.println("Good Night!");
        }

    }
}

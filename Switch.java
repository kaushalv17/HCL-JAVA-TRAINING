import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working Day");
                break;

            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid Day");
        }

        sc.close();
    }
}
    


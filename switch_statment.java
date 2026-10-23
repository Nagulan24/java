import java.util.Scanner;
public class switch_statment {
    public static void main(String[] args){
        int choice = 2;

        switch (choice) {
            case 1 :
                System.out.println("check balanace");
                break;
            case 2:
                System.out.println("deposit");
                break;
            case 3:
                System.out.println("withdraw");
                break;
            default:
                System.out.println("Choice is not 1, 2 or 3");

        }

        int month = 1;
        // intentionally not using break statement to demonstrate fall through
        switch(month) {
            case 3 :
            case 6 :
            case 9 :
            case 12 :
                System.out.println("It's a quarter end");
                break;
            default:
                System.out.println("Month is not in any quarter");
        }

        // Using switch expression (Java 14 and above) - arrow syntax
        switch (choice) {
            case 1 -> System.out.println("check balanace");
            case 2 -> System.out.println("deposit");
            case 3 -> System.out.println("withdraw");
            default -> System.out.println("Choice is not 1, 2 or 3");
        }

        // Using switch expression with yield (Java 14 and above)
        // This will return a value based on the choice

        String  action = switch (choice) {
            case 1 -> "check balanace";
            case 2 -> "deposit";
            case 3 -> "withdraw";
            default -> "Choice is not 1, 2 or 3";
        };
        System.out.println("Action: " + action);

        //in traditional switch statement, we can use yield to return a value
        String action2 = switch (choice) {
            case 1:
                yield "check balanace";
            case 2:
                yield "deposit";
            case 3:
                yield "withdraw";
            default:
                yield "Choice is not 1, 2 or 3";
        };

        // eg switch statement with weekdays and weekend

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week (1-7): ");
        int day = sc.nextInt();

        String status = switch(day){
            case 1,7 -> "It's a weekend";
                        
            case 2,3,4,5,6 -> {
                System.out.println("It's a weekday");
                yield "it's a office working day";
        }
            default -> "Invalid day";
        };
        System.out.println("Status: " + status);

        // enum example with switch statement
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        System.out.println("Enter a day of the week : ");
        String today = sc.next().toUpperCase();

        String cureent_day =switch(today) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "It's a weekday";
            case "SATURDAY", "SUNDAY" -> "It's a weekend";
            default -> "Invalid day or check your spelling";
        };
        System.out.println("Current day: " + cureent_day);

    }
}

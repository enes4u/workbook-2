import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReservationApp {

    public static void main(String[] args) {
        Scanner scheduler = new Scanner(System.in);

        //full name
        System.out.println("Please enter your name: ");
        String fullName = scheduler.nextLine().trim();

        //prompt the user for the date of the show
        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scheduler.nextLine().trim();
        DateTimeFormatter fullMonth = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter singleMonth = DateTimeFormatter.ofPattern("M/dd/yyyy");

        //LocalDate formatted = LocalDate.parse(date, singleMonth);
        boolean isFullMonth = date.matches("\\d{2}/\\d{2}/\\d{4}");
        boolean isSingleMonth =date.matches("\\d{1}/\\d{2}/\\d{4}");
        LocalDate formatted = null ;
        if (isFullMonth){
            formatted = LocalDate.parse(date, fullMonth); //LocalDate formatted = LocalDate.parse(date, fullMonth);
                // java lets declare only once
                // to avoid reassign dont declare again

        } else if (isSingleMonth) {
             formatted = LocalDate.parse(date, singleMonth);

        }


        //how many tickets
        System.out.println("How many tickets would you like? ");
        int numTickets =scheduler.nextInt();

        //parse name -- first last
        String[] nameParts = fullName.split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        //confirmation message
        String ticketWord = (numTickets==1) ? "ticket" : "tickets" ;

        System.out.printf("%d %s reserved for %s under %s, %s%n", numTickets, ticketWord, date, lastName, firstName);
       System.out.println(formatted.toString());
        scheduler.close();





    }
}

import java.util.Scanner;

/**
 * Created by golde on 19/03/2017.
 */
public class Main {

    Booking booking = new Booking();

    public static void main(String[] args) {
        Main menu = new Main();
        menu.menu();
    }

    public void menu(){

        Scanner n = new Scanner(System.in);
        System.out.println(" 1. Book room \n 2. Check Booking \n 3. Add room \n 4. Remove room");
        int i = n.nextInt();
        switch(i){
            case 1: menu2(i);
            break;
            case 2: menu2(i);
            break;
            case 3: System.out.println("Add room");
            break;
            case 4: System.out.println("Remove room");
            break;
        }
    }
    public void menu2(int i){
        Scanner input = new Scanner(System.in);
        System.out.println("Which day of the month would you like to start on?");
        //this outputs a line to the console
        int month = input.nextInt();
        //this takes the user input and stores it in an new variable called month

        System.out.println("How many days would you like to stay?");
        int duration = input.nextInt();

        System.out.println("What kind of room would you like? \n 1. Single room \n 2. Double room \n 3. Family room");
        //this prints the next menu screen

        int usrInput = input.nextInt();
        //this takes input from the user and stores it in a new variable usrInput

        switch(usrInput){
            case 1: System.out.println("Which room number would you like, the numbers are 1, 2, 5, 6");
                break;
            case 2: System.out.println("Which room number would you like, the numbers are 3 and 4");
                break;
            case 3: System.out.println("Which room number would you like, the numbers are 7 and 8");
                break;
        }
        //this is a switch case statement, depending on what the answer was from the last menu it gives the user
        // the appropriate choice of room numbers
        int roomNumber = input.nextInt();
        if(i == 1) {
            booking.read(month, roomNumber, duration);
        }else if(i == 2){
            booking.read(month, roomNumber, duration);
        }
    }

}

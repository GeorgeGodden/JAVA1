import java.io.*;
import java.util.Scanner;

/**
 * Created by golde on 28/03/2017.
 */
public class Booking {
    File file = new File("Booking.txt");
    String File = "Booking.txt";

    int[][] aryBooking = new int[32][8]; //creates an array that it 32 rows down and 8 rows across
    //this creates a scanner, this is used to take input from the user
    public void booking(int month, int roomNumber, int duration) {
        int day = month;
        for(int counter = 0; counter < duration; counter++) {
            month = day + counter;
            aryBooking[month][roomNumber] = 1;
        }
        //this stores the number 1 in the selected day and room number
        write();
    }
    public void read(int month, int roomNumber, int duration){
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(File);
            br = new BufferedReader(fr);
            String sCurrentLine;
            br = new BufferedReader(new FileReader(File));
            int c = 0;
            while ((sCurrentLine = br.readLine()) != null ) {

                String[] aryFill = sCurrentLine.split(", ");
                for (int x = 0; x < aryFill.length; x++){
                    String A = aryFill[x];
                    int B = Integer.parseInt(A);
                    aryBooking[c][x] = B;
                }
                c++;
                //System.out.println(sCurrentLine);
                //System.out.println(aryFill);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        checkBooking(month, roomNumber, duration);
    }

    public void write() {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter array = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(array)) {
                for (int c = 0; c < aryBooking.length; c++) {
                    for (int x = 0; x < aryBooking[c].length; x++) {
                        bw.write(aryBooking[c][x] + ", ");
                    }
                    bw.write("\n");
                }
                bw.close();
                System.out.println("your array was saved");
            }
            array.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int row = 0; row < 32; row++) {
            for (int column = 0; column < 8; column++) {
                System.out.print(aryBooking[row][column] + "\t");
            }
        }
    }


        public void checkBooking(int month, int roomNumber, int duration){
        Scanner a = new Scanner(System.in);
        Main main = new Main();
        int day = month;
        for(int counter = 0; counter < duration; counter++){
            month = day+counter;
            if(aryBooking[month][roomNumber]==1){
                System.out.println("Unfortunatly you cannot have room " + roomNumber + "on " + counter + "\nday however you can have it for every day before that");
            }else{
                System.out.println("This room can be yours would you like it? \n1. Yes \n2. No");
                int A = a.nextInt();
                if(A == 1){
                    booking(month, roomNumber, duration);
                }else{
                    main.menu();
                }
            }

        }
//load array from text file and check specific dates use if statements to get it to output
    }

}

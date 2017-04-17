import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by golde on 28/03/2017.
 */
public class Booking {
    File file = new File("C:\\Users\\golde\\OneDrive - South Gloucestershire and Stroud COllege\\College\\Unit 20 event driven programming\\ass 1\\JAVA 1\\src\\Bin\\Booking.txt");

    int[][] aryBooking = new int[32][8]; //creates an array that it 32 rows down and 8 rows across
    //this creates a scanner, this is used to take input from the user
    public void booking(int month, int roomNumber){

        aryBooking[month][roomNumber] = 1;
        //this stores the number 1 in the selected day and room number

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter array = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(array)) {
                for (int i =0; i < aryBooking.length;i++){
                    for (int j =0; j < aryBooking[i].length;j++){
                        bw.write(aryBooking[i][j] + ", ");
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

        for(int row = 0; row<32;row++){
            for(int column=0;column<8;column++){
                System.out.print(aryBooking[row][column]+"\t");
            }
        }
    }
    public void checkBooking(int month, int roomNumber){

        if(aryBooking[month][roomNumber] == 1){
            System.out.println("Unfortunatly you cannot have this room");

        }else{
            System.out.println("this room can be yours");
        }
//load array from text file and check specific dates use if statements to get it to output
    }

}

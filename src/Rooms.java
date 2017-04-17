/**
 * Created by golde on 21/03/2017.
 */
public class Rooms {
    public void rooms(){
        int roomNumber;
        int price;
        boolean miniBar;
        boolean cableTv;
        boolean suitPress;
    }
    public void array(){
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        FamilyRoom familyRoom = new FamilyRoom();

        Rooms a[] = new Rooms[8];
        a[1] = singleRoom;
        a[2] = singleRoom;
        a[3] = doubleRoom;
        a[4] = doubleRoom;
        a[5] = singleRoom;
        a[6] = singleRoom;
        a[7] = familyRoom;
        a[8] = familyRoom;


    }

}

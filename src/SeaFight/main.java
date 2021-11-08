package SeaFight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Ship> Ships1Player = new ArrayList<>();

        ShipField shipField1 = new ShipField();
        shipField1.print();
        Ship ship10 = new Ship(5,3);
        shipField1.addShip(ship10);
        //System.out.println(ship10.shipSize);
        //System.out.println(Arrays.toString(ship10.coordinates()));
        shipField1.print();
        //Player player1 = new Player("Denis");
        //player1.shot(shipField1);
    }
}

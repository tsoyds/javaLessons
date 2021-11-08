package SeaFight;


// 0 - nothing; 1 - ship; 2 - areaOfShip;
public class ShipField {
    private String[][] field = new String[10][10];
    public ShipField (){
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                this.field[i][j]="\uD83C\uDF0A";
            }
        }
    }


    public void addShip (Ship ship){ //добавление кораблей
        int i, j, k, l,  m,  n,  o,  p;
        switch (ship.shipSize) {
            case 1: i=ship.coordinates()[0]; j =ship.coordinates()[1]; //добавление однопалубного корабля
                field[i][j] = "\uD83D\uDEF3";
                for (int z=i-1; z<i+2; z++){
                    for (int f=j-1; f<j+2; f++){
                        if (z==i&f==j) continue;
                        field[z][f] = "\uD83D\uDEE5";
                    }
                }

                System.out.println("Hello from case 1");
                break;
            case 2: /*
                ship.coordinates()[0];
                field[i][j] = "\uD83D\uDEF3";
                field[k][l] = "\uD83D\uDEF3";
                System.out.println("Hello from case 2");
                break;
                */
            case 3:
                System.out.println("Hello from case 3");
                break;
            case 4:
                System.out.println("Hello from case 4");
                break;
        }

    }






    void print (){
        for (int i=0; i< field.length; i++){
            for (int j=0; j<field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }

    }

}

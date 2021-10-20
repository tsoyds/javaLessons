package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(){
        this.stamina = (int) (90+10*(Math.random()));
        //countPlayers++;
        if (countPlayers>6){
            System.out.println("Количество игроков достаточно для игры");}
        else{
                countPlayers++;
        }
    }
    public void run(){
    this.stamina=(getStamina() - 1);
    if (getStamina() == MIN_STAMINA) {
        countPlayers--;
        info();
    }
    }
    public static void info(){
        if (countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+ (6-countPlayers)+" свободных мест");
        }
        else{
            System.out.println("На поле нет свободных мест");
        }
    }


    public int getStamina() {
        return stamina;
    }


}

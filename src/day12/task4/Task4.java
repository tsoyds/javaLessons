package day12.task4;

public class Task4 {
    public static void main(String[] args){
        MusicBand band1 = new MusicBand("Green day", 2001); // Create object band1 /w name and year
        MusicBand band2 = new MusicBand("Linkin Park", 1989); // create object band2 /w name and year
        System.out.println(band1); //print to console info about band 1
        System.out.println(band2);

        band1.addMembers("Joe Ewton"); //add member to first band1
        band1.addMembers("Hillary Duff"); //add member to first band1
        band2.addMembers("Chester Bennington"); //add member to second band2
        band2.addMembers("Mr.idontknow"); //add member to second band2

        band1.printMembers(band1); //print to console members of band1
        band2.printMembers(band2); //print to console members of band2

        band1.transferMembers(band1, band2); // transfer members from band2 to band1

        band1.printMembers(band1); //again print members
        band1.printMembers(band2);


        System.out.println(band1);
        System.out.println(band2);
    }
}

package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name; // name of MusicBand
    private int year; //year of creation MusicBand
    private String nameArtist;
    private int ageArtist;
    MusicArtist member;
    private List<MusicArtist> members = new ArrayList<>(); //list of members in MusicBand

    public void addMembers(String nameArtist, int ageArtist){ //method of adding members to MusicBand
        member = new MusicArtist(nameArtist, ageArtist);
        this.member = member;
        members.add(member);
    }

    public MusicBand(String name, int year){ //constructor of object creation MusicBand
        this.name=name;
        this.year=year;
    }

    public int getYear() {
        return year;
    } //getter

    public static void transferMembers(MusicBand band1, MusicBand band2){ //transfer members from 2nd band to 1st
        band1.members.addAll(band2.members);
    }

    public static void printMembers(MusicBand band){ //print to console list of members MusicBand
        System.out.println(band.members);
    }
    @Override
    public String toString() { //toString info about MusicBand - name and year
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
class MusicArtist {
    private String nameArtist;
    private int ageArtist;
    public MusicArtist(String nameArtist, int ageArtist){
        this.nameArtist=nameArtist;
        this.ageArtist=ageArtist;
    }
    @Override
    public String toString() {
        return "MusicArtist{" +
                "nameArtist='" + nameArtist + '\'' +
                ", ageArtist=" + ageArtist +
                '}';
    }
}


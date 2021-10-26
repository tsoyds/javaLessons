package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name; // name of MusicBand
    private int year; //year of creation MusicBand
    private String member; //member of MusicBand
    private List<String> members = new ArrayList<>(); //list of members in MusicBand

    public void addMembers(String member){ //method of adding members to MusicBand
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


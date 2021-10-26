package day12.task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands
             ) {
            //System.out.println(band);
            if (band.getYear()>=2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
    public static void main(String[] args){
        List<MusicBand> bands = new ArrayList<>();
        //bands.add(new MusicBand("Queen", 1984));
        bands=Arrays.asList(new MusicBand("Queen", 1984), new MusicBand("Nana", 1988),
                new MusicBand("Eagles", 1974),new MusicBand("Light", 1994),
                new MusicBand("Imagine Dragons", 2001),
                new MusicBand("System of a down", 2003),
                new MusicBand("Skillet", 2005));
        System.out.println(bands);
        groupsAfter2000(bands);
        System.out.println("GroupsAfter2000");
        System.out.println(groupsAfter2000(bands));


    }
}

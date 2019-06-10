package com.company;
import java.util.ArrayList;
public class TapestryController {

    public static void main(String[] args) {


        ArrayList<Pattern> patternLog = new ArrayList<>();

        Pattern newPattern = new CrossStitchWigglePattern();
        patternLog.add(newPattern);

        Pattern zzlp = new ZigZagLinesPattern();
        patternLog.add(zzlp);


        Pattern bbp = new BaublePattern();
        patternLog.add(bbp);

        Pattern bbp2 = new BlockyBaublePattern();
        patternLog.add(bbp2);


        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 8; j++) {
                patternLog.get(0).pattern();
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 8; j++) {
                patternLog.get(1).pattern();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 8; j++) {
                patternLog.get(2).pattern();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" "); //rows
            for (int j = 0; j < 8; j++) { //columns
                patternLog.get(3).pattern();
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 8; i++) { //rows
            System.out.println(" "); //columns
            for (int j = 0; j < 6; j++) {
                patternLog.get(0).pattern();
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                patternLog.get(1).pattern();
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                patternLog.get(2).pattern();
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                patternLog.get(3).pattern();
            }
        }
    }
}



package gui;
import java.io.*;
import java.util.Scanner;

public class SpellChk{

    public boolean Dictionary1(String input){
        boolean chck = false;
        Scanner sc = new Scanner(new File("usa.txt"));
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if (line == input){
                    chck = true;
            }
        }
        return chck;
    }
}
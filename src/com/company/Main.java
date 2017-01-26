package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner user = new Scanner(System.in);
        String colber = "";
        int c = 0;
        int u = 1;
        int d = 0;
        Scanner reader = new Scanner(new File("colors.txt"));
        String names[] = new String[148];
        for (int x = 0; x < 148; x++) {
            names[x] = reader.nextLine();
        }
        String hex[] = new String[148];
        for (int x = 0; x < 148; x++) {
            hex[x] = reader.nextLine();
        }
        System.out.println("Enter a color in hexadecimal format, as a RGB triplet, or as a word");
        String color = user.nextLine();
        if (color.contains(",")) {
            u = 0;
            Scanner sc = new Scanner(color);
            sc.useDelimiter(",\\s+");
            while (sc.hasNext())
                colber = colber + Integer.toHexString(Integer.parseInt(sc.next()));
            System.out.println("The hexadecimal format is " + colber);
            while (true) {
                for (int x = 0; x < 148; x++) {
                    if (hex[x].equalsIgnoreCase(colber)) {
                        System.out.println("The name of the color is :" + names[x]);
                        break;
                    }
                    if (x >= 147)
                        System.out.println("This is not a name color.");
                }
            }

        }
        for (int x = 0; x < 148; x++) {
            if (names[x].equalsIgnoreCase(color)) {
                System.out.println("The hexadecimal of the color is :" + hex[x]);
                colber = "";
                u = 0;
                System.out.print("The rgb triplet is: ");
                for (int z = 0; z <= 4; z = z + 2) {
                    colber = hextodec.convert(hex[x].substring(z, z+2));
                    System.out.print(colber + " ");
                }
            }

        }
        if (u ==1)
        {
            for (int x = 0; x < 148; x++) {
                if (hex[x].equalsIgnoreCase(color)) {
                    System.out.println("The name of the color is :" + names[x]);
                    colber = "";
                    u = 0;
                    System.out.print("The rgb triplet is: ");
                    for (int z = 0; z <= 4; z = z + 2) {
                        colber = hextodec.convert(hex[x].substring(z, z+2));
                        System.out.print(colber + " ");
                    }
                    break;
                }
                if (x >= 147)
                    System.out.println("This is not a name color.");
            }
        }
    }
}

import Enums.Planets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название планеты:");
        Scanner in = new Scanner(System.in);
        String planet = in.nextLine().toLowerCase();
        switch (planet) {
            case "венера":
            case "venuc":
                System.out.println(Planets.VENUS);
                break;
            case "марс":
            case "mars":
                System.out.println(Planets.MARS);
                break;
            case "земля":
            case "earth":
                System.out.println(Planets.EARTH);
                break;
            case "меркурий":
            case "mercury":
                System.out.println(Planets.MERCURY);
                break;
            case "нептун":
            case "neptune":
                System.out.println(Planets.NEPTUNE);
                break;
            case "плутон":
            case "pluto":
                System.out.println(Planets.PLUTO);
                break;
            case "сатурн":
            case "saturn":
                System.out.println(Planets.SATURN);
                break;
            case "уран":
            case "uranus":
                System.out.println(Planets.URANUS);
                break;
            case "юпитер":
            case "jupiter":
                System.out.println(Planets.JUPITER);
                break;
            default:
                System.out.println("No such planet: "+planet);
        }
    }
}

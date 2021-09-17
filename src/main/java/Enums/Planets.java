package Enums;

public enum Planets {
    VENUS("Venus", 2, 4.81068, 6.052),
    EARTH("Earth", 3, 5.97600, 6.378),
    MARS("Mars", 4, 0.63345, 3.488),
    MERCURY("Mercury", 1, 0.32868, 2.439),
    NEPTUNE("Neptune", 8, 101.59200, 24.750),
    PLUTO("Pluto", 9, 0.01195, 2.000),
    SATURN("Saturn", 6, 561.80376, 60.100),
    URANUS("Uranus", 7, 86.05440, 26.500),
    JUPITER("Jupiter", 5, 1876.64328, 71.300);

    private final String name;
    private final int num;
    private final double weight;
    private final double radius;
    Planets( String name,int num, double weight, double r) {
        this.name = name;
        this.num =  num;
        this.weight = weight;
        this.radius = r;
    }

    @Override
    public String toString() {
        return "Planet name: " + name + "\n" +
                "Planet position num: " + num + "\n" +
                "Planet weight: " + weight + "*10^24\n" +
                "Planet equatorial radius: " + radius + "*10^6\n";
    }
}

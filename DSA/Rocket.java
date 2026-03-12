public class Rocket {

    String name;
    String agency;
    int launchYear;

    public Rocket(String name, String agency, int launchYear) {
        this.name = name;
        this.agency = agency;
        this.launchYear = launchYear;
    }

    public void display() {
        System.out.println(name + " | " + agency + " | " + launchYear);
    }
}
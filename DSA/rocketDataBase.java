import java.util.ArrayList;

public class rocketDataBase {

    public static ArrayList<Rocket> rockets = new ArrayList<>();

    public static void addRocket(Rocket r) {
        rockets.add(r);
    }

    public static void displayRockets() {

        if(rockets.isEmpty()){
            System.out.println("No Rockets in Database");
            return;
        }

        System.out.println("\nRocket Database");

        for(Rocket r : rockets){
            r.display();
        }
    }
}
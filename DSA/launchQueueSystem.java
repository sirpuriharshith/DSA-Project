import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class launchQueueSystem {

    static Queue<String> launchQueue = new LinkedList<>();

    public static void addLaunchQueue(Scanner sc){

        System.out.print("Enter Upcoming Mission: ");
        String mission=sc.nextLine();

        launchQueue.add(mission);

        System.out.println("Mission added to Launch Queue");
    }

    public static void processLaunchQueue(){

        if(launchQueue.isEmpty()){
            System.out.println("No Missions in Queue");
            return;
        }

        System.out.println("Processing Launch: " + launchQueue.poll());
    }
}
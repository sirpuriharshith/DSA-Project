import java.util.Stack;
import java.util.Scanner;

public class launchStack {

    static Stack<String> launchHistory = new Stack<>();

    public static void addLaunchHistory(Scanner sc){

        System.out.print("Enter Launch Mission: ");
        String mission = sc.nextLine();

        launchHistory.push(mission);

        System.out.println("Mission added to Launch History");
    }

    public static void showLaunchHistory(){

        if(launchHistory.isEmpty()){
            System.out.println("No Launch History");
            return;
        }

        System.out.println("Launch History (LIFO)");

        for(String s : launchHistory){
            System.out.println(s);
        }
    }
}

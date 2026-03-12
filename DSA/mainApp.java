import java.util.Scanner;

public class mainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do{

            System.out.println("\n===== Rocket Database System =====");

            System.out.println("1 Add Rocket");
            System.out.println("2 Display Rockets");
            System.out.println("3 Linear Search Rocket");
            System.out.println("4 Binary Search Rocket");
            System.out.println("5 Sort Rockets");
            System.out.println("6 Add Launch History (Stack)");
            System.out.println("7 Show Launch History");
            System.out.println("8 Add Launch Queue");
            System.out.println("9 Process Launch Queue");
            System.out.println("0 Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Enter Rocket Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Agency: ");
                    String agency = sc.nextLine();

                    System.out.print("Enter Launch Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    rocketDataBase.addRocket(new Rocket(name,agency,year));
                    break;

                case 2:
                    rocketDataBase.displayRockets();
                    break;

                case 3:
                    searchAlgorithms.linearSearch(sc);
                    break;

                case 4:
                    searchAlgorithms.binarySearch(sc);
                    break;

                case 5:
                    sortAlgorithms.bubbleSort();
                    break;

                case 6:
                    launchStack.addLaunchHistory(sc);
                    break;

                case 7:
                    launchStack.showLaunchHistory();
                    break;

                case 8:
                    launchQueueSystem.addLaunchQueue(sc);
                    break;

                case 9:
                    launchQueueSystem.processLaunchQueue();
                    break;

                case 0:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice!=0);
    }
}
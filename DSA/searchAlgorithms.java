import java.util.Scanner;

public class searchAlgorithms {

    public static void linearSearch(Scanner sc) {

        System.out.print("Enter Rocket Name: ");
        String key = sc.nextLine();

        boolean found=false;

        for(Rocket r : rocketDataBase.rockets){

            if(r.name.equalsIgnoreCase(key)){
                r.display();
                found=true;
            }
        }

        if(!found)
            System.out.println("Rocket Not Found");
    }

    public static void binarySearch(Scanner sc){

        sortAlgorithms.bubbleSort();

        System.out.print("Enter Rocket Name: ");
        String key=sc.nextLine();

        int low=0;
        int high=rocketDataBase.rockets.size()-1;

        while(low<=high){

            int mid=(low+high)/2;

            int cmp=rocketDataBase.rockets.get(mid).name.compareToIgnoreCase(key);

            if(cmp==0){
                rocketDataBase.rockets.get(mid).display();
                return;
            }

            else if(cmp<0)
                low=mid+1;

            else
                high=mid-1;
        }

        System.out.println("Rocket Not Found");
    }
}

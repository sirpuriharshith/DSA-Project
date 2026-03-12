public class sortAlgorithms {

    public static void bubbleSort(){

        for(int i=0;i<rocketDataBase.rockets.size()-1;i++){

            for(int j=0;j<rocketDataBase.rockets.size()-i-1;j++){

                if(rocketDataBase.rockets.get(j).name
                .compareTo(rocketDataBase.rockets.get(j+1).name) > 0){

                    Rocket temp = rocketDataBase.rockets.get(j);

                    rocketDataBase.rockets.set(j,
                    rocketDataBase.rockets.get(j+1));

                    rocketDataBase.rockets.set(j+1,temp);
                }
            }
        }

        System.out.println("Rockets Sorted by Name");
    }
}
package PracticeTests;

import java.util.List;

public class TruckTour {

    /*
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */

    public static int truckTour(List<List<Integer>> petrolpumps) {

        int petrol = 0;

        int index = 0;

        for (int i=0; i < petrolpumps.size(); i++) {
            // At arriving at the petrol pump
            petrol += petrolpumps.get(i).get(0);

            //After travelling a distance to get to the pump;
            petrol = petrol - petrolpumps.get(i).get(1);


            if (petrol < 0) {
                petrol = 0;
                index = i +1;
            }


        }

        return index;

    }
}

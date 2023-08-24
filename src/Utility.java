

import java.util.Random;
public class Utility {
    public static int generateID(int lowerBound, int upperBound){
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}

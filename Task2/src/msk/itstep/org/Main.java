package msk.itstep.org;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] summands = new int[] {1, 7, 9, 15, 32, 18, 100};
        System.out.println("For the following addends: " + Arrays.toString(summands));

        int[] testSums = new int[] {5, 10, 25, 16, 30, 31, 50, 60, 61, 70, 65, 100};
        SumSplitter sumSplitter = new SumSplitter(summands);

        for (int testSum : testSums) {
            List<Integer> representation = sumSplitter.split(testSum);
            if (representation == null)
                System.out.println(testSum + " is not representable!");
            else
                System.out.println(testSum + " is representable with addends: " + representation);
        }
    }
}

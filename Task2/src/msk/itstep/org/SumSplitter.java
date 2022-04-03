package msk.itstep.org;

import java.util.ArrayList;
import java.util.List;

public class SumSplitter {
    private int[] summands;

    public SumSplitter(int[] summands) {
        this.summands = summands;
    }

    private boolean[][] findSplitRelation(int sum)
    {
        //splitRelation[i][j] == true if j can be represented as a sum of a subset of first i summands
        boolean[][] splitRelation = new boolean[summands.length][sum + 1];

        for (int i = 0; i < summands.length; i++)
            splitRelation[i][0] = true; //zero is considered representable for any set since empty set is a subset of
        //any set

        for (int j = 1; j <= sum; j++)
            for (int i = 0; i < summands.length; i++)
                splitRelation[i][j] = i == 0 && summands[0] == j
                        || i > 0 && splitRelation[i - 1][j]
                        || i > 0 && j - summands[i] >= 0 && splitRelation[i - 1][j - summands[i]];

        return splitRelation;
    }

    private List<Integer> findSumRepresentation(boolean[][] splitRelation)
    {
        int sum = splitRelation[0].length - 1;

        if (!splitRelation[summands.length - 1][sum])
            return null;  //solution does not exist

        ArrayList<Integer> representation = new ArrayList<>();
        for (int subsum = sum; subsum > 0;)
            for (int summandIndex = 0; summandIndex < summands.length; summandIndex++)
                if (splitRelation[summandIndex][subsum])
                {
                    representation.add(summands[summandIndex]);
                    subsum -= summands[summandIndex];
                    break;
                }

        return representation;
    }

    public List<Integer> split(int sum) {
        return findSumRepresentation(findSplitRelation(sum));
    }
}

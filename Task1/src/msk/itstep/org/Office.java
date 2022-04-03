package msk.itstep.org;

import java.util.*;

public class Office {
    private ArrayList<Official> officials = new ArrayList<Official>();

    public void addOfficial (Official official) {
        officials.add(official);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Official official : officials) {
            List<Official> prerequisites = official.getPrerequisiteOfficials();
            if (prerequisites.size() == 0)
                continue;

            result.append("{" + official.toString() + ", [");
            for (Official prerequisite : prerequisites)
                result.append(prerequisite.toString() + ", ");

            result.delete(result.length() - 2, result.length());
            result.append("]}, ");
        }

        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    public List<Official> getOfficialsOrder(int formNumber) {
        List<Official> suitableOfficials = officials.stream().filter(o -> o.getFormNumber() == formNumber).toList();
        if (suitableOfficials.size() == 0)
            return null;

        Stack<Official> walkStack = new Stack<>();
        walkStack.add(suitableOfficials.get(0));
        LinkedList<Official> resultingOrder = new LinkedList<>();

        while (walkStack.size() > 0) {
            Official officialToVisit = walkStack.pop();
            resultingOrder.addFirst(officialToVisit);

            for (Official prerequisiteOfficial : officialToVisit.getPrerequisiteOfficials())
                walkStack.add(prerequisiteOfficial);
        }

        return resultingOrder;
    }
}

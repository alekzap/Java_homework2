package msk.itstep.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Official
{
    private int formNumber;
    private ArrayList<Official> prerequisiteOfficials = new ArrayList<Official>();

    public Official(int formNumber) {
        this.formNumber = formNumber;
    }

    public int getFormNumber() {
        return formNumber;
    }

    public List<Official> getPrerequisiteOfficials() {
        return Collections.unmodifiableList(prerequisiteOfficials);
    }

    public void addPrerequisiteOfficial(Official official) {
        prerequisiteOfficials.add(official);
    }

    @Override
    public String toString() {
        return String.valueOf(formNumber);
    }
}

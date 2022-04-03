package msk.itstep.org;

public class Main {

    public static void main(String[] args) {
        Official ivanov = new Official(1);
        Official petrov = new Official(2);
        Official sidorov = new Official(3);
        Official popov = new Official(4);
        Official andreev = new Official(5);
        ivanov.addPrerequisiteOfficial(petrov);
        petrov.addPrerequisiteOfficial(sidorov);
        petrov.addPrerequisiteOfficial(popov);
        popov.addPrerequisiteOfficial(andreev);

        Office office = new Office();
        office.addOfficial(ivanov);
        office.addOfficial(petrov);
        office.addOfficial(sidorov);
        office.addOfficial(popov);
        office.addOfficial(andreev);

        System.out.println("With the following dependencies: " + office.toString());

        int formNumber = 1;
        System.out.println("The visits order to get " + formNumber + " is: "
                + office.getOfficialsOrder(formNumber));
    }
}

package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper developer, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Index yok");
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("Index dolu");
            return;
        }

        juniorDevelopers[index] = developer;
    }

    public void addEmployee(MidDeveloper developer, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Index yok");
            return;
        }

        if (midDevelopers[index] != null) {
            System.out.println("Index dolu");
            return;
        }

        midDevelopers[index] = developer;
    }

    public void addEmployee(SeniorDeveloper developer, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Index yok");
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("Index dolu");
            return;
        }

        seniorDevelopers[index] = developer;
    }
}
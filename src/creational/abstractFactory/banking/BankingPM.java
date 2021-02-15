package creational.abstractFactory.banking;

import creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project Manager manages banking project...");
    }
}

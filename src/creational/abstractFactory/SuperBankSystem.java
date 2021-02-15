package creational.abstractFactory;

import creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main (String[] args){
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QATester qaTester = projectTeamFactory.getQATester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        qaTester.testProject();
        projectManager.manageProject();
    }
}

package creational.abstractFactory;

import creational.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QATester qaTester = projectTeamFactory.getQATester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Website creating...");
        developer.writeCode();
        qaTester.testProject();
        projectManager.manageProject();
    }
}

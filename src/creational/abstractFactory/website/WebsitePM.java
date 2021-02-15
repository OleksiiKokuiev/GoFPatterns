package creational.abstractFactory.website;

import creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project...");
    }
}

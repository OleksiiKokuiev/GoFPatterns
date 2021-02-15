package creational.abstractFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    ProjectManager getProjectManager();

    QATester getQATester();
}

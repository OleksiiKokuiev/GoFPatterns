package creational.abstractFactory.website;

import creational.abstractFactory.QATester;

public class ManualTester implements QATester {
    @Override
    public void testProject() {
        System.out.println("QA tester tests website...");
    }
}

package creational.factory;

public class Application {

    public static void main (String[] args){
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        developerFactory.createDeveloper().writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }
}

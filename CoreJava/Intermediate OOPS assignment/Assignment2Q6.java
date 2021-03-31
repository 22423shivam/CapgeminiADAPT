package CapgeminiAssignment;
 abstract class Persistence {

    public abstract void persist();
}

 class DatabasePersistence extends Persistence {
    @Override
    public void persist() {
        System.out.println("Data is persisted in the Database");
    }
}

class FilePersistence extends Persistence{
    @Override
    public void persist() {
        System.out.println("Data is persisted in the File");
    }
}

public class Assignment2Q6 {

    public static void main(String args[]) {
        Persistence persistence = getPersistenceObject();
        persistence.persist();
    }

    private static Persistence getPersistenceObject() {
        return new  DatabasePersistence();


    }
}

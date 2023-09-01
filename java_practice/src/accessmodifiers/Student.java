package accessmodifiers;

public class Student {

    private String name; //private
    int batchId; // default = package protected
    protected double psp; // protected
    public String universityName; // public

    public void doSomething(String name, int batchId, double psp, String universityName) {
        // all attributes are accessible here as this is the same class
        this.name = name;
        this.batchId = batchId;
        this.psp = psp;
        this.universityName = universityName;
    }

}



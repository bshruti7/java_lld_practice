package accessmodifiers;

public class StudentChild extends Student {

    public void doSomething() {
        // batchId, psp and universityName all are accessible since they are
        // default, protected, public attributes which are accessible in same package
        // even in child classes

    }
}

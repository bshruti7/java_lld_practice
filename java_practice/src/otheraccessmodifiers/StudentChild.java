package otheraccessmodifiers;

import accessmodifiers.Student;

public class StudentChild extends Student {

    public void doSomething() {
        // Both PSP and universityName are accessible to this keyword

    }

    // only universityName is accessible if you instantiate Student class and try to access attributes.
    // alternatively psp is accessible if you instantiate StudentChild class here, as the psp is protected
    // and is accessible to child class objects even outside its primary package


}

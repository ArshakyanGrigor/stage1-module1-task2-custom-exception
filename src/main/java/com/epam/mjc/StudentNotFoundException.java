package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String exMassage){
        super(exMassage);
    }
}

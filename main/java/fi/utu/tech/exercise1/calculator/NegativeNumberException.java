package fi.utu.tech.exercise1.calculator;

import java.util.ArrayList;

public class NegativeNumberException extends Exception {

    private ArrayList message;

    public NegativeNumberException(ArrayList message) {
        this.message = message;
    }

    public String getMessage() {
        return String.join(",", message).replace(",", "");
    }

}

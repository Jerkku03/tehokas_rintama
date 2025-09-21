package fi.utu.tech.exercise1;

import fi.utu.tech.exercise1.calculator.CalculatorUser;
import fi.utu.tech.exercise1.maze.Movement;
import fi.utu.tech.exercise1.maze.Reader;

public class Main {
    public static void main(String[] args) throws Exception{

        var user = new CalculatorUser();
        user.use1();
        user.use2();
        user.use3();

        var reader = new Reader();
        reader.read();
        reader.test();

        var movement = new Movement();
        movement.testMove();
        movement.testReverse();

    }
}
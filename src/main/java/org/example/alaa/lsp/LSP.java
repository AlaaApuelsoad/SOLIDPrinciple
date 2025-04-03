package org.example.alaa.lsp;

import org.example.alaa.lsp.problem.Bird;
import org.example.alaa.lsp.problem.Penguin;

public class LSP {
    public static void main(String[] args) {
        System.out.println("Liskov Substitution");
        System.out.println("******************************");

        /*
        States that subclasses should be substitutable of their base classes.
        This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to
        any method that expects an object of class A and the method should not give any weird output in that case.

        This is the expected behavior, because when we use inheritance we assume that the child class inherits
        everything that the superclass has. The child class extends the behavior but never narrows it down.
         */

        Bird bird = new Bird();
        bird.fly();

        Penguin penguin = new Penguin();
        penguin.fly();//--> throws and exception penguin cannot fly
    }
}

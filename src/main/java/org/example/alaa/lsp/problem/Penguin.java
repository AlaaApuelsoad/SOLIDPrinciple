package org.example.alaa.lsp.problem;

public class Penguin extends Bird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin does not fly");
    }
}

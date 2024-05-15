package main.java.list.Ordenacao;

import java.util.Comparator;

public class NumerosInteiros implements Comparable<NumerosInteiros> {
    private int numeros;

    public NumerosInteiros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compareTo(NumerosInteiros num) {
        return Integer.compare(numeros, num.getNumeros());
    }

    private int getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "NumerosInteiros{" +
                "numeros=" + numeros +
                '}';
    }
}


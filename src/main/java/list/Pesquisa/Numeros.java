package main.java.list.Pesquisa;

public class Numeros {
    private int numeroInteiro;

    public Numeros(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    @Override
    public String toString() {
        return "Numero:"  + numeroInteiro;
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }
}

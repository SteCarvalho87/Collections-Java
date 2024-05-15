package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for(Numeros num : numerosList){
                soma = soma + num.getNumeroInteiro();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numerosList.isEmpty()){
            for(Numeros num : numerosList){
                if (num.getNumeroInteiro() > maiorNumero){
                    maiorNumero = num.getNumeroInteiro();
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 999999999;
        if (!numerosList.isEmpty()){
            for(Numeros num : numerosList){
                if (num.getNumeroInteiro() < menorNumero){
                    menorNumero = num.getNumeroInteiro();
                }
            }
        }
        return menorNumero;
    }

    public List exibirNumeros(){
        return numerosList;
    }

    public static void main(String[] args) {
        SomaNumeros listaNum = new SomaNumeros();

        listaNum.adicionarNumero(1);
        listaNum.adicionarNumero(100);
        listaNum.adicionarNumero(125);
        listaNum.adicionarNumero(21);
        listaNum.adicionarNumero(12);
        listaNum.adicionarNumero(10);
        listaNum.adicionarNumero(9);
        listaNum.adicionarNumero(8);
        listaNum.adicionarNumero(37);

        System.out.println(listaNum.calcularSoma());
        System.out.println(listaNum.encontrarMaiorNumero());
        System.out.println(listaNum.encontrarMenorNumero());
        System.out.println(listaNum.exibirNumeros());

    }
}

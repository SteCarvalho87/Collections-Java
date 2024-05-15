package main.java.list.Ordenacao;

import main.java.list.Pesquisa.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class OrdenacaoNumeros {
    private List<NumerosInteiros> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int  numero) {
        listaNumeros.add(new NumerosInteiros(numero));
    }

    public List<NumerosInteiros> ordenarAscendente() {
        List<NumerosInteiros> listaAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public List<NumerosInteiros> ordenarDescendente() {
        List<NumerosInteiros> listaDescendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaDescendente, Collections.reverseOrder());
        return listaDescendente;
    }public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(11);
        ordenacaoNumeros.adicionarNumero(8);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}

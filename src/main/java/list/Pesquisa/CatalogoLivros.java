package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosCatalogo;

    public CatalogoLivros() {
        this.livrosCatalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao) {
        livrosCatalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosCatalogo.isEmpty()){
            for (Livro l : livrosCatalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosCatalogo.isEmpty()) {
        }
        for (Livro l : livrosCatalogo) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(l);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosCatalogo.isEmpty()) {
            for(Livro l : livrosCatalogo){
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1",
                2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2",
                2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 1",
                2021);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3",
                2022);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4",
                2023);
        catalogoLivros.adicionarLivro("Livro 5","Autor 5",
                1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println("___________________");
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println("___________________");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println("___________________");
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
        System.out.println("___________________");
    }

}

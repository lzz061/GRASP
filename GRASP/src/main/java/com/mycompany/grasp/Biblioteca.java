package com.mycompany.grasp;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    /* ==============================================================================
     * GRASP APLICADO: Creator
     * MÉTODO: adicionarLivro()
     * * O padrão Creator define quem deve ser responsável por criar 
     * uma nova instância de uma classe. A regra diz que a Classe B deve criar a 
     * Classe A se B contém ou agrega A. Como a 'Biblioteca' é o contêiner que 
     * armazena os objetos 'Livro', ela é a classe correta para instanciá-los. 
     * Isso promove o Baixo Acoplamento, pois o Controlador não precisa saber como 
     * o Livro é construído, apenas repassa os dados.
     * ============================================================================== */
    
    public void adicionarLivro(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor); // A Biblioteca atua como Creator
        livros.add(novoLivro);
    }

    public List<Livro> getLivros() {
        return livros;
    }
}

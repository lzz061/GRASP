package com.mycompany.grasp;

public class Controller {
        private Biblioteca biblioteca;

    public Controller() {
        this.biblioteca = new Biblioteca();
    }

    /* ==============================================================================
     * GRASP APLICADO: Controller
     * CLASSE/MÉTODO: Classe BibliotecaController e método registrarLeitura()
     * * O padrão Controller sugere que um objeto que não seja a 
     * interface de usuário (UI) seja responsável por receber e lidar com os eventos 
     * do sistema. Esta classe atua como intermediária entre a interface (o método main) 
     * e a lógica de negócios (a classe Biblioteca). Isso garante Alta Coesão na UI, 
     * que fica responsável apenas por exibir dados, enquanto o Controller coordena 
     * as ações.
     * ============================================================================== */
    public void registrarLeitura(String titulo, String autor) {
        // O controlador recebe a requisição do sistema e delega o trabalho
        biblioteca.adicionarLivro(titulo, autor);
    }

    public void exibirListaDeLeitura() {
        System.out.println("--- Minha Lista de Leitura ---");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.toString());
        }
        System.out.println("------------------------------");
}
    }

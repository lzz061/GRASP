package com.mycompany.grasp;

// 1. Classe de Domínio
public class Main {
    public static void main(String[] args) {
        // Inicializa o Controlador
        Controller controller = new Controller();

        // O sistema dispara eventos (entradas do usuário) para o Controlador
        controller.registrarLeitura("Clean Code", "Robert C. Martin");
        controller.registrarLeitura("Design Patterns", "Gang of Four");

        // Solicita a exibição dos dados
        controller.exibirListaDeLeitura();
    }
}

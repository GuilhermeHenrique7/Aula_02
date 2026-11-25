package Aula_02.DesafioFinal;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] usuarios = new String[10][3];

        int totalUsuarios = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("""
                    
                    1 - Cadastrar,                  
                    2 - Consultar
                    3 - Atualizar
                    4 - Deletar
                    0 - Sair
                    """);
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    totalUsuarios = cadastrarUsuario(usuarios, totalUsuarios, sc);
                    break;
                case 2:
                    consultarUsuarios(usuarios, totalUsuarios);
                    break;
                case 3:
                    atualizarUsuario(usuarios, totalUsuarios, sc);
                    break;
                case 4:
                    totalUsuarios = deletarUsuario(usuarios, totalUsuarios, sc);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }
    }
        public static int cadastrarUsuario(String[][] usuarios, int totalUsuarios, Scanner sc) {
            if (totalUsuarios >= usuarios.length) {
                System.out.println("Limite de cadastros atingido!");
                return totalUsuarios;
            }
            System.out.print("Digite o nome: ");usuarios[totalUsuarios][0] = sc.nextLine();
            System.out.print("Digite o e-mail: ");usuarios[totalUsuarios][1] = sc.nextLine();
            System.out.print("Digite o telefone: ");usuarios[totalUsuarios][2] = sc.nextLine();
            System.out.println("Usuário cadastrado com sucesso!");return totalUsuarios + 1;

        }
    public static void consultarUsuarios(String[][] usuarios, int totalUsuarios) {
        if (totalUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n--- LISTA DE USUÁRIOS ---");
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println("ID: " + i + " | Nome: " + usuarios[i][0] + " | E-mail: " + usuarios[i][1] + " | Telefone: " + usuarios[i][2]);
        }
    }

    public static void atualizarUsuario(String[][] usuarios, int totalUsuarios, Scanner sc) {
        if (totalUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado para atualizar.");
            return;
        }

        consultarUsuarios(usuarios, totalUsuarios);
        System.out.print("Digite o ID do usuário que deseja atualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (id < 0 || id >= totalUsuarios) {
            System.out.println("ID inválido!");
            return;
        }

        System.out.print("Novo nome: ");
        usuarios[id][0] = sc.nextLine();
        System.out.print("Novo e-mail: ");
        usuarios[id][1] = sc.nextLine();
        System.out.print("Novo telefone: ");
        usuarios[id][2] = sc.nextLine();

        System.out.println("Usuário atualizado com sucesso!");
    }
    public static int deletarUsuario(String[][] usuarios, int totalUsuarios, Scanner sc) {
        if (totalUsuarios == 0) {
            System.out.println("Nenhum usuário cadastrado para deletar.");
            return totalUsuarios;
        }

        consultarUsuarios(usuarios, totalUsuarios);
        System.out.print("Digite o ID do usuário que deseja deletar: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (id < 0 || id >= totalUsuarios) {
            System.out.println("ID inválido!");
            return totalUsuarios;
        }

        for (int i = id; i < totalUsuarios - 1; i++) {
            usuarios[i][0] = usuarios[i + 1][0];
            usuarios[i][1] = usuarios[i + 1][1];
            usuarios[i][2] = usuarios[i + 1][2];
        }

        usuarios[totalUsuarios - 1][0] = null;
        usuarios[totalUsuarios - 1][1] = null;
        usuarios[totalUsuarios - 1][2] = null;

        System.out.println("Usuário deletado com sucesso!");
        return totalUsuarios - 1;
    }
}

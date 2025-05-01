
import java.util.Scanner; // Importa a classe Scanner, usada para ler o que o usuário digita

public class Main {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo(); // Cria um objeto da classe Catalogo, onde os itens serão armazenados
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do teclado
        int opcao; // Variável que armazenará a opção escolhida no menu

        // Início do menu interativo
        do {
            // Exibe as opções para o usuário
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Adicionar Revista");
            System.out.println("3 - Adicionar Material Digital");
            System.out.println("4 - Buscar Item");
            System.out.println("5 - Atualizar Item");
            System.out.println("6 - Listar Itens");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário (número)
            scanner.nextLine(); // Limpa a quebra de linha que ficou pendente

            // Verifica qual opção o usuário escolheu
            switch (opcao) {
                case 1: // Adicionar Livro
                    System.out.print("Titulo: ");
                    String tituloL = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorL = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    // Cria um novo objeto Livro e adiciona ao catálogo
                    catalogo.adicionarItem(new Livro(tituloL, autorL, isbn));
                    break;

                case 2: // Adicionar Revista
                    System.out.print("Titulo: ");
                    String tituloR = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorR = scanner.nextLine();
                    System.out.print("Edicao: ");
                    int edicao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    // Cria um novo objeto Revista e adiciona ao catálogo
                    catalogo.adicionarItem(new Revista(tituloR, autorR, edicao));
                    break;

                case 3: // Adicionar Material Digital
                    System.out.print("Titulo: ");
                    String tituloM = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorM = scanner.nextLine();
                    System.out.print("Formato (PDF, MP4, etc): ");
                    String formato = scanner.nextLine();
                    // Cria um novo objeto MaterialDigital e adiciona ao catálogo
                    catalogo.adicionarItem(new MaterialDigital(tituloM, autorM, formato));
                    break;

                case 4: // Buscar Item
                    System.out.print("Digite o titulo ou autor para buscar: ");
                    String termo = scanner.nextLine();
                    catalogo.buscarItem(termo); // Chama o método de busca
                    break;

                case 5: // Atualizar informações de um item
                    System.out.print("Titulo atual do item: ");
                    String tituloAntigo = scanner.nextLine();
                    System.out.print("Novo titulo: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo autor: ");
                    String novoAutor = scanner.nextLine();
                    catalogo.atualizarItem(tituloAntigo, novoTitulo, novoAutor); // Atualiza os dados do item
                    break;

                case 6: // Listar todos os itens do catálogo
                    catalogo.listarItens(); // Exibe todos os itens cadastrados
                    break;

                case 0: // Encerrar o programa
                    System.out.println("Encerrando...");
                    break;

                default: // Se o usuário digitar uma opção inválida
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0); // Repete o menu até o usuário digitar 0 (sair)

        scanner.close(); // Fecha o Scanner
    }
}

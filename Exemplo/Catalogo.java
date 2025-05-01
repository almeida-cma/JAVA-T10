import java.util.ArrayList;
import java.util.List;

// Esta classe representa o "catálogo" da biblioteca.
// Ela é responsável por armazenar e gerenciar os itens (livros, revistas, etc.)
public class Catalogo {

    // Lista que guarda todos os itens do catálogo. É uma lista de objetos do tipo Item.
    private List<Item> itens;

    // Construtor: quando um objeto Catalogo for criado, essa lista começa vazia.
    public Catalogo() {
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um novo item ao catálogo.
    public void adicionarItem(Item item) {
        itens.add(item); // adiciona o item à lista
        System.out.println("Item adicionado com sucesso!");
    }

    // Método para buscar itens por título ou autor. O termo pode ser parcial.
    public void buscarItem(String termo) {
        boolean encontrado = false; // controle para saber se achou algum item

        // Percorre todos os itens do catálogo
        for (Item item : itens) {
            // Converte os textos para minúsculas e verifica se o termo está contido no título ou autor
            if (item.getTitulo().toLowerCase().contains(termo.toLowerCase())
                    || item.getAutor().toLowerCase().contains(termo.toLowerCase())) {

                item.exibirDetalhes(); // mostra as informações do item
                encontrado = true; // marca que encontrou
            }
        }

        // Se não encontrou nada, mostra uma mensagem
        if (!encontrado) {
            System.out.println("Nenhum item encontrado com o termo: " + termo);
        }
    }

    // Método para atualizar o título e o autor de um item, buscando pelo título atual.
    public void atualizarItem(String tituloAntigo, String novoTitulo, String novoAutor) {
        // Percorre todos os itens
        for (Item item : itens) {
            // Se encontrar um item com o título antigo (ignora maiúsculas/minúsculas)
            if (item.getTitulo().equalsIgnoreCase(tituloAntigo)) {
                item.setTitulo(novoTitulo); // atualiza o título
                item.setAutor(novoAutor);   // atualiza o autor
                System.out.println("Item atualizado com sucesso!");
                return; // sai do método depois de atualizar
            }
        }

        // Se não encontrar o título antigo
        System.out.println("Item nao encontrado para atualizacao.");
    }

    // Método que mostra todos os itens do catálogo.
    public void listarItens() {
        // Se a lista estiver vazia, informa isso ao usuário
        if (itens.isEmpty()) {
            System.out.println("O catalogo esta vazio.");
        } else {
            // Caso contrário, exibe os detalhes de cada item
            for (Item item : itens) {
                item.exibirDetalhes();
            }
        }
    }
}

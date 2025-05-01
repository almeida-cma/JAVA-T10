// Esta classe representa um Livro e herda (estende) da classe Item.

public class Livro extends Item {

    // Atributo específico da classe Livro: o código ISBN (identificador único de livros)
    private String isbn;

    // Construtor da classe Livro.
    // Quando criamos um Livro, precisamos informar título, autor e ISBN.
    public Livro(String titulo, String autor, String isbn) {
        super(titulo, autor); // Chama o construtor da classe mãe (Item) para definir título e autor
        this.isbn = isbn;     // Define o ISBN específico do livro
    }

    // Método que retorna o ISBN do livro
    public String getIsbn() {
        return isbn;
    }

    // Método que permite alterar o ISBN do livro
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Este método sobrescreve (override) o método abstrato exibirDetalhes() da classe Item.
    // Ele mostra as informações completas do livro.
    @Override
    public void exibirDetalhes() {
        System.out.println("Livro - Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn);
    }
}

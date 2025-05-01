// Esta é a classe base (superclasse) para todos os tipos de itens no catálogo.
// Ela é abstrata porque serve apenas de modelo — não se cria diretamente um "Item", mas sim um Livro, Revista etc.

public abstract class Item {

    // Estes são os atributos comuns a todos os itens do catálogo: título e autor.
    // O modificador "protected" permite que as subclasses (como Livro, Revista) acessem diretamente esses atributos.
    protected String titulo;
    protected String autor;

    // Construtor da classe: é chamado quando um novo objeto do tipo Item (ou de uma classe filha) é criado.
    public Item(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Métodos "getters": permitem acessar (ler) os valores dos atributos.
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Métodos "setters": permitem alterar os valores dos atributos.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método abstrato: as subclasses serão obrigadas a criar sua própria versão desse método.
    // Isso é útil porque cada tipo de item (Livro, Revista, Material Digital) pode exibir os detalhes de forma diferente.
    public abstract void exibirDetalhes();
}

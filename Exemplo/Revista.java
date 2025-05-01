// Esta classe representa uma Revista
// Ela herda da classe Item, ou seja, também tem título e autor

public class Revista extends Item {

    // Atributo específico da revista: a edição (por exemplo, edição 12)
    private int edicao;

    // Construtor da classe Revista
    // Quando uma nova revista for criada, deve-se informar o título, autor e a edição
    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);     // Usa o construtor da classe Item para definir título e autor
        this.edicao = edicao;     // Define a edição da revista
    }

    // Método que retorna o número da edição da revista
    public int getEdicao() {
        return edicao;
    }

    // Método que permite alterar o número da edição da revista
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    // Este método é obrigatório pois foi definido como abstrato na classe Item
    // Ele mostra as informações da revista no console
    @Override
    public void exibirDetalhes() {
        System.out.println("Revista - Titulo: " + titulo + ", Autor: " + autor + ", Edicao: " + edicao);
    }
}

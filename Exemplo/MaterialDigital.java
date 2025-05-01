// Esta classe representa um Material Digital (como PDF, vídeo, áudio, etc.)
// Ela herda da classe Item, ou seja, também possui título e autor.

public class MaterialDigital extends Item {

    // Atributo específico do Material Digital: o formato (ex: PDF, MP4, MP3)
    private String formato;

    // Construtor da classe. Recebe título, autor e formato ao criar o objeto.
    public MaterialDigital(String titulo, String autor, String formato) {
        super(titulo, autor);   // Chama o construtor da classe mãe (Item) para definir título e autor
        this.formato = formato; // Define o formato do material digital
    }

    // Método para obter (acessar) o formato do material digital
    public String getFormato() {
        return formato;
    }

    // Método para alterar (modificar) o formato do material digital
    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Este método é obrigatório pois a classe Item exige a implementação de exibirDetalhes().
    // Aqui ele mostra as informações completas do Material Digital no console.
    @Override
    public void exibirDetalhes() {
        System.out.println("Material Digital - Titulo: " + titulo + ", Autor: " + autor + ", Formato: " + formato);
    }
}

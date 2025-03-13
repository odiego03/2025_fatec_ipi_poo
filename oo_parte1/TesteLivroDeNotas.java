public class TesteLivroDeNotas {
    public static void main(String... args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        LivroDeNotas livro2 = new LivroDeNotas();

        livroDeNotas.setNomeDaDisciplina("POO");
        livro2.setNomeDaDisciplina("BD");

        livroDeNotas.exibirMensagem();
        livro2.exibirMensagem();
    }
}
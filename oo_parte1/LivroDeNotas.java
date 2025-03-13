class LivroDeNotas{
    String nomeDaDisciplina;
    void setNomeDaDisciplina(String nomeDaDisciplina){
        this.nomeDaDisciplina = nomeDaDisciplina;
    }
    void exibirMensagem(){
        System.out.println("Bem-vindo ao livro de notas de " + nomeDaDisciplina + "!");
    }
}
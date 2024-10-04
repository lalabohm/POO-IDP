public class Cliente extends Pessoa {
    protected int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente: " + nome + ", Código: " + codigo + ", Nascimento: " + nascimento);
    }
}

class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }

    public String getNome() {
        return nome;
    }
}
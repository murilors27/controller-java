public class Aluno {

    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private Long id;

    // Construtor sem parâmetros (necessário para o Spring)
    public Aluno() {}

    // Construtor com parâmetros (caso necessário)
    public Aluno(String nome, String cpf, String telefone, int idade, Long id) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.id = id;
    }

    // Getters e Setters
}

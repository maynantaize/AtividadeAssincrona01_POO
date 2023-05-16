import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private ArrayList<Conta> conta = new ArrayList<>();
    private ArrayList<Telefone> telefone = new ArrayList<>();

    Cliente(String nome, String cpf, Endereco endereco, ArrayList<Conta> conta , ArrayList<Telefone> telefone){
        this.nome = nome;
        this.nome = cpf;
        this.endereco = endereco;
        this.conta = conta;
        this.telefone = telefone;
    }

    public Cliente() {
	}

	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }
    public void setConta(ArrayList<Conta> contas) {
        this.conta = contas;
    }

    public ArrayList<Telefone> getTelefone() {
        return telefone;
    }
    public void setTelefone(ArrayList<Telefone> telefones) {
        this.telefone = telefones;
    }

    //Métodos
    public void adicionarTelefone(Telefone telefone) {
        this.telefone.add(telefone);
    }
    
    public void removerTelefone(Telefone telefone) {
        this.telefone.remove(telefone);
    }
    
    public void atualizarTelefone(Telefone telefoneAntigo, Telefone telefoneNovo) {
        int index = telefone.indexOf(telefoneAntigo);
        if (index != -1) {
            telefone.set(index, telefoneNovo);
        }
    }
    
    public void adicionarConta(Conta conta) {
        this.conta.add(conta);
    }
    
    public void removerConta(Conta conta) {
        this.conta.remove(conta);
    }
    
    public void atualizarConta(Conta contaAntiga, Conta contaNova) {
        int index = conta.indexOf(contaAntiga);
        if (index != -1) {
            conta.set(index, contaNova);
        }
    }
}

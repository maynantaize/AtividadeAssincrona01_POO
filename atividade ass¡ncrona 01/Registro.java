import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Registro {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
   
    public void cadastrarClientes(){
    System.out.println("Digite o nome:");
    String nome = sc.nextLine();

    System.out.println("Digite seu cpf:");
    String cpf = sc.nextLine();

    System.out.println("Digite seu cep:");
    String cep = sc.nextLine();

    System.out.println("Digite seu logradouro:");
    String logradouro = sc.nextLine();

    System.out.println("Digite seu número:");
    int numero = sc.nextInt();

    System.out.println("Digite o número da conta:");
    int numeroDaConta = sc.nextInt();

    System.out.println("Digite o saldo da conta:");
    int saldo = sc.nextInt();

    System.out.println("Digite a agência:");
    int agencia = sc.nextInt();

    System.out.println("Digite o ddd:");
    int ddd = sc.nextInt();

    System.out.println("Digite o número de telefone:");
    int numeroDeTelefone = sc.nextInt();
    
    clientes.add(new Cliente(nome, cpf, (new Endereco(cep, logradouro, numero)),
    (new ArrayList<>(Arrays.asList(new Conta(numeroDaConta, agencia, saldo)))),
    (new ArrayList<>(Arrays.asList(new Telefone(ddd, numeroDeTelefone))))));
 }
 public void listarClientes(){
        for(int i = 0; i < clientes.size(); i++){
        	
        	Cliente cliente = clientes.get(i);
        	//obtem a primeira conta do cliente
        	 Conta conta = cliente.getConta().get(0);
        	 //obtem o primeiro telefone do cliente
        	 Telefone telefone = cliente.getTelefone().get(0);
        	
            System.out.println("O cliente " + (i+1) + " com o nome " + cliente.getCpf() + " com o cpf " + cliente.getNome()
            + " reside no endereço de cep: " + cliente.getEndereco().getCep() + " e logradouro: " + cliente.getEndereco().getLogradouro()
            + " casa de número: " + cliente.getEndereco().getNumero() 
            + " número da conta: " + conta.getNumeroDaConta() + " agência: " + conta.getAgencia()
            + " número de telefone: " + telefone.getDdd() + "-" +telefone.getNumeroDeTelefone());
        }
        
    }
public void excluirCliente(){
    System.out.println("Qual cliente deseja remover?");
    int opcao;
    for(int j = 0; j < clientes.size(); j++){
        System.out.println("O cliente número: " + (j + 1));
        opcao = sc.nextInt();
        opcao -= 1;
        clientes.remove(opcao);
    }
 }
}
        

   

   

    
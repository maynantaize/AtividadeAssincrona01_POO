import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Excluir cliente");
            System.out.println("4 - Sair do programa");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    registro.cadastrarClientes();
                    break;
                case 2:
                    registro.listarClientes();
                    break;
                case 3:
                    registro.excluirCliente();
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        scanner.close();
    }
    
}
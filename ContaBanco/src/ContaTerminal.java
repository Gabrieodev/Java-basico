import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as informações da conta
        int numero;
        String agencia;
        
        // Dados pré-definidos
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); 
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        // Exibe a mensagem final com os dados inseridos e os pré-definidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite a agencia da conta a ser criada:");
        conta.setAgencia(entrada.nextLine());

        System.out.println("Digite o número da conta a ser criada:");
        conta.setNumero(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Digite o nome do cliente da conta a ser criada:");
        conta.setNomeCliente(entrada.nextLine());

        System.out.println("Digite o saldo inicial da conta a ser criada:");
        conta.setSaldo(entrada.nextDouble());

        System.out.println("Conta criada: ");

        // Fechar o Scanner
        entrada.close();

        
    }
}

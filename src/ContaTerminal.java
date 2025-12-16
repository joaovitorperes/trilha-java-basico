import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Configura o Scanner para usar ponto como separador decimal, independente da configuração regional (importante para o Saldo)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // 1. Leitura do Número da Conta (Inteiro)
        System.out.println("Por favor, digite o número da Conta (Ex: 1021):");
        numero = scanner.nextInt();
        // O nextInt() deixa um Enter pendente no buffer!

        // Limpa o buffer de entrada (consumindo o Enter pendente)
        scanner.nextLine();
        
        // 2. Leitura da Agência (Texto)
        System.out.println("Por favor, digite o número da Agência (Ex: 067-8):");
        agencia = scanner.nextLine();
        // Usamos nextLine() para garantir que pegamos o formato completo (Ex: 067-8)

        
        // 3. Leitura do Nome do Cliente (Texto Completo com espaços)
        System.out.println("Por favor, digite o Nome do Cliente (Ex: MARIO ANDRADE):");
        // **CORREÇÃO APLICADA AQUI:** Usa nextLine() para ler o nome completo, incluindo espaços
        nomeCliente = scanner.nextLine();
        
        
        // 4. Leitura do Saldo (Decimal)
        System.out.println("Por favor, digite o Saldo Inicial (Ex: 237.48):");
        saldo = scanner.nextDouble();

        
        // Fechar o objeto Scanner
        scanner.close();
        
        // 5. Exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
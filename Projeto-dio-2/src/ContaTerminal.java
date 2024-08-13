import java.util.Scanner;
import java.math.BigDecimal;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Agência ! ");
   int numeroAgencia = scanner.nextInt();
    
    
    System.out.println("Digite o nome da agencia: ");
    String agencia = scanner.next();
    
    
    System.out.println("Digite o nome do cliente: ");
    
    String nome = scanner.next();
    
    System.out.println("Digite o saldo: ");
    BigDecimal saldo  = scanner.nextBigDecimal();
    
    
    System.out.println("Olá " +nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+numeroAgencia+" e seu saldo "+saldo+ "já está disponível para saque");
   
    
    


    }
}

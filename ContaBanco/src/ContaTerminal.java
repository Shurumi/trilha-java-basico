import java.util.Scanner;
public class ContaTerminal {
    
   public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

    System.out.println("Por favor, digite o nome: ");
    String nomeCliente = input.next();

    System.out.println("Por favor, digite seu número: ");
    int numero = input.nextInt();

    System.out.println("Por favor, digite sua Agência: ");
    String agencia = input.next();

    System.out.println("Por favor, digite seu saldo:");
    double saldo = input.nextDouble();

    System.out.println("Òla "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+ numero+", e seu saldo "+saldo+" já está disponivel para saque.");

   
   }
}

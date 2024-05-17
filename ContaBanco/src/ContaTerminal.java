import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {

         Scanner entrada = new Scanner(System.in);
         String nomeCliente, agencia;
         int numero;
         double saldo;

         System.out.println("Olá! Para iniciar nosso atendimento, digite o seu nome completo:");
         nomeCliente = entrada.nextLine();

         System.out.println("Digite o número da sua agência");
         agencia = entrada.nextLine();

         System.out.println("Digite o número da sua conta");
         numero = entrada.nextInt();

         System.out.println("Digite o seu saldo");
         saldo = entrada.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        entrada.close();
    }

}

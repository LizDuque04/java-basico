
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número da conta: ");
        numero = entrada.nextInt();
        entrada.nextLine();

        String agencia;

        System.out.println("Digite o número da sua agencia");
        agencia = entrada.next();

        String nomeCliente;
        System.out.println("Digite seu nome completo: ");
        nomeCliente = entrada.next();

        float saldo;
        System.out.println("Digite seu saldo: ");
        saldo = entrada.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        int numConta = scanner.nextInt();		
		
		scanner.nextLine(); //consome o \n pra que o scanner nextline leia a linha certa
		
		System.out.println("Digite o número da agência: ");
	    String agencia = scanner.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
	    
	    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo R$" + saldo + " já está disponível para saque");
	}
}
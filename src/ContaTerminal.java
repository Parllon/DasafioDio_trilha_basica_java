import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite Número da Conta:");
		int Numero = Integer.parseInt(sc.nextLine());
		System.out.print("Digite Número da Agencia:");
		String Agencia = (sc.nextLine());
		System.out.print("Digite Nome do Cliente:");
		String Cliente = sc.nextLine();
		System.out.print("Digite o Saldo:");
		float Saldo = Float.parseFloat(sc.nextLine());
		System.out.println("Olá "+ Cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
		", conta "+ Numero +" e seu saldo de "+ Saldo +" já está disponível para saque");
		sc.close();
	}

}

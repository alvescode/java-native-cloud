import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.println("Por favor, digite o número da Conta !");
            Integer nmrConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o Nome do Titular !");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo Inicial!");
            double saldoInicial = scanner.nextDouble();

            System.out.printf(
                    "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                    nomeCliente, agencia, nmrConta, saldoInicial);

        } catch (InputMismatchException e) {
            System.out.printf(
                    "Dados Inválidos: \n-> O campo \"Número da Conta\" deve ser númerico\n-> O campo \"Saldo Inicial\" deve ser escrito com \".\" ao invés de \",\".\n");
        } catch (Exception e) {
            System.out.printf(
                    "Houve um erro durante a execução do programa.\n");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}

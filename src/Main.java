import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        AccountBalance accountBalance = new AccountBalance();

        while(running) {

            System.out.println("""
                    1 - Ver balance de la cuenta\

                    2 - Hacer deposito\

                    3 - Retirar dinero\

                    4 - Salir""");

            try {
                int opcionElegida = scanner.nextInt();

                switch (opcionElegida) {
                    case 1:
                        System.out.println(accountBalance);
                        break;

                    case 2:
                        DepositMoney depositMoney = new DepositMoney(accountBalance);
                        depositMoney.deposit();
                        System.out.println(depositMoney);
                        break;

                    case 3:
                        WithdrawMoney withdrawMoney = new WithdrawMoney(accountBalance);
                        withdrawMoney.withdraw();
                        System.out.println(withdrawMoney);
                        break;

                    case 4:
                        running = false;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Esa opción no es válida\n");
                        break;
                }
            }   catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }
        }
    }
}
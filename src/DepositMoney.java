import java.util.Scanner;
import java.util.InputMismatchException;

public class DepositMoney {

    private double lastDeposit;
    private AccountBalance accountBalance;

    public DepositMoney (AccountBalance accountBalance){
        this.accountBalance = accountBalance;
        this.lastDeposit = 0;
    }

    public void deposit(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuanto dinero desea depositar?");

        try{
            double userDeposit = scanner.nextDouble();


            if(userDeposit > 0){
                lastDeposit = userDeposit;
                accountBalance.updateBalance(userDeposit);

            }   else {
                System.out.println("El monto debe ser positivo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
        }
    }
    public String toString() {
        return "Último depósito realizado: " + lastDeposit +
                ", Balance actual de la cuenta: " + accountBalance.getMonetaryBalance();
    }
}

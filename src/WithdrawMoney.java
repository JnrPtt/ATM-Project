import java.util.InputMismatchException;
import java.util.Scanner;

public class WithdrawMoney {
    private double lastWithdraw;
    private AccountBalance accountBalance;

    public WithdrawMoney (AccountBalance accountBalance){
        this.accountBalance = accountBalance;
        this.lastWithdraw = 0;
    }

    public void withdraw(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuanto dinero desea retirar?");



        try{
            double userWithdraw = scanner.nextDouble();


            if(userWithdraw > 0){
                lastWithdraw = userWithdraw;
                accountBalance.retireMoney(userWithdraw);

            }   else {
                System.out.println("El monto debe ser positivo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
        }
    }
    public String toString() {
        return "Último retiro realizado: " + lastWithdraw +
                ", Balance actual de la cuenta: " + accountBalance.getMonetaryBalance();
    }
}


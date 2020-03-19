package task23;

public class ATMLogic {

    private DepositOperations depositOperations = new DepositOperations();
    int currentBalance = depositOperations.getUsersDeposite();

    public void startWorking(String usersChoice) {
        System.out.println("Some text 4");
        if (usersChoice == "D" || usersChoice == "d") {
            currentBalance = depositOperations.depositeMoney();

        } else if (usersChoice == "W" || usersChoice == "w") {
            currentBalance = depositOperations.withdrawMoney();
        }
    }
}

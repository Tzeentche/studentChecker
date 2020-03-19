package task23;

//      Создать класс и объекты, описывающие Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//      количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат. Сделать функцию, снимающую деньги.
//      На вход передается сумма денег.

import java.util.Scanner;

public class ATMInterpretator {

    DepositOperations depo = new DepositOperations();
    private Scanner scaner;
    int usersDeposit = depo.getUsersDeposite();

    public void helloMessage() {
        System.out.println("Your's deposit is " + usersDeposit);
        System.out.println("Do you want deposit or withdraw bills? [D/W]");
    }

    public String depositOrWithdraw() {
        while(true) {
            if(scaner == null) {
                scaner = new Scanner(System.in);
            } else {

                String dOrW = scaner.nextLine();
                dOrW = dOrW.trim();
                if (dOrW.equals("D") | dOrW.equals("d") | dOrW.equals("W") | dOrW.equals("w")) {
                    return dOrW;
                }
            }
        }
    }
}

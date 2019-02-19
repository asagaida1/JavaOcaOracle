package HomeWork.Lesson5;

public class BankAccount {
    double account;

    double popolnenie(double x){
        return account+=x;

    }

    double spisanie(double x){
        return account-=x;
    }
}


class BanckAccountTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        System.out.println("bA.account = " + bA.account);
        bA.popolnenie(100.5);
        System.out.println("bA.account = " + bA.account);
        bA.spisanie(50.5);
        System.out.println("bA.account = " + bA.account);


    }
}

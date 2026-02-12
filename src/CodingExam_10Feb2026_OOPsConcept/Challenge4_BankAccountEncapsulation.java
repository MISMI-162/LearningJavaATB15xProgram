package CodingExam_10Feb2026_OOPsConcept;class bankAccount {
    private int balance;
    private int deposit;
    private int withdraw;

    public void setBalance(int b) {
        this.balance=b;
    }

    public int getBalance() {
        return balance;
    }

    public void setDeposit(int d) {
        if(d<0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        this.deposit=d;
        balance=balance+deposit;
    }
    public int getDeposit() {
        return deposit;
    }
    public void setWithdrawal(int w) {
        if(w>balance) {
            System.out.println("Withdrawal not feasible as balance is NOT sufficient");
            return;
        }
        this.withdraw=w;
        balance=balance-withdraw;
    }
    public int getWithdrawal() {
        return withdraw;
    }
}
public class Challenge4_BankAccountEncapsulation {
    public static void main(String[] main) {
        bankAccount b=new bankAccount();
        b.setBalance(1000);
        System.out.println("Balance "+b.getBalance());
        b.setDeposit(2000);
        System.out.println("Deposit to be done "+b.getDeposit());
        System.out.println("After deposit balance "+b.getBalance());
        b.setWithdrawal(300);
        System.out.println("Withdrawal "+b.getWithdrawal());
        System.out.println("After withdrawal Balance "+b.getBalance());
    }
}

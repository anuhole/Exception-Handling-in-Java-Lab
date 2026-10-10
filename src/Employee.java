import java.time.LocalDate;

public class Employee {
    String acountId;
    double balance;
    float rate;
    LocalDate createdDate;

    public Employee(String acountId, double balance, float rate) {
        this.acountId = acountId;
        this.balance = balance;
        this.rate = rate;

    }

    public void deposit(double amount){
        this.balance =this.balance+amount;
    }
    public double withdraw(double amount) throws OverDrawnException {
        if(amount > balance)
            throw new OverDrawnException();
        this.balance =this.balance - amount;
        return amount;

    }


    public void display() {
        System.out.println("Employee{" +
                "acountId='" + acountId + '\'' +
                ", balance=" + balance +
                ", rate=" + rate +
                ", date=" + createdDate +
                '}');
    }
    public void checkBalance(){
        System.out.println("Balance is "+balance);
    }
}

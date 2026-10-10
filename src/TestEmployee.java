public class TestEmployee {
    public static void main(String[] args) {
        try{
            Employee emp=new Employee("101",1200,5);
            System.out.println("Display Ditails");
            emp.display();
            System.out.println("Deposit 500");
            emp.deposit(500.0);

            emp.checkBalance();

            System.out.println("Withraw 1500");
            emp.withdraw(1500.0);

            emp.checkBalance();

            System.out.println(" Withdraw 800");
            emp.withdraw(800.0);

        } catch (OverDrawnException e) {
            System.out.println("Over Drwn Exception"+e.getMessage());
        }
    }
}

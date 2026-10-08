class Bank_Account {
    String AccountHolder;
    double balance;
    void transfer(Bank_Account receiver, double Amount){
        if(balance >= Amount){
            balance -= Amount;
            receiver.balance += Amount;
        }
    }
    public class main{
            public static void main(String[] args){
                Bank_Account a1= new Bank_Account();
                Bank_Account a2= new Bank_Account();
                a1.balance= 5000;
                a2.balance= 1000;
                a1.transfer(a2, 2000);
                System.out.println("Account 1 balance: " + a1.balance);
                a2.transfer(a1, 500);
                System.out.println("Account 2 balance: " + a2.balance);
            }
         
        }
    }

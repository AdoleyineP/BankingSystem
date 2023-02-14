public class Details {
    String accountName;
    int accountNumber;
    float amount;


    void insertInfo(String name, int number, float amt){
        accountName = name;
        accountNumber = number;
        amount = amt;
    }

    void deposit(float amt){
        amount = amount + amt;
    }

    void withdraw(float amt){
        if(amount > amt){
            amount = amount - amt;
        }else{
            System.out.println("Please insufficient Amount entered");
        }
    }

    void checkInfo(){
        System.out.printf("Account Name: %s \nAccount Number: %d \nBalance: $%f \n", accountName, accountNumber, amount);
    }
    void displayBalance(){
        System.out.printf("The remaining balance is $%f \n", amount);
    }

}

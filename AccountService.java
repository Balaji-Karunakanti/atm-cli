 package AtmCli;
public class AccountService {
     Account acc;
   
     public AccountService(Account acc){
      this.acc = acc;
     }

  public boolean depositAmount(double amount){
     if(amount<100){
       return false;
     }else{
       double balance = acc.getBalance();
       double newBalance = balance+amount;
       acc.setBalance(newBalance); 
     }
     return true;
  }
 
   public double getBalance(){
     
      return acc.getBalance();
   }
   public boolean hasSufficientBalance(double requestedAmount){
       double presentBalance = acc.getBalance();
       if(presentBalance >= requestedAmount){
        return true;
       }

       return false;
   }

   public boolean withdrawAmount(double amount){
    if(amount <=0){
         return false;
    }
       boolean flag=  hasSufficientBalance(amount);
       if(flag){
         double removeAmount = acc.getBalance();
         acc.setBalance(removeAmount-amount);
         return true;
       }
       return false;
   }
}


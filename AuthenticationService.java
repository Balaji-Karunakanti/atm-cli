package AtmCli;
public class AuthenticationService {
   private int userPin = 1621;
   private int failedAttempts = 0;

  public boolean validatePin(int enteredPin){
      if(isAttemptsRemaining()  && userPin == enteredPin ){
      resetAttempts();
        return true;
      }  else{
        failedAttempts++;
      }
       return false;
    }
  

  public boolean isAttemptsRemaining(){
      if(failedAttempts <3){
        return true;
      }
      return false;
    }


    public void resetAttempts(){
      failedAttempts =0;
    }
  }
   


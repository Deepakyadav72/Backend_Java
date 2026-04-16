public class AccessMd {
    public static void main(String[] args){
       BankAcount AC=new BankAcount();
       AC.username="Deepak";
       AC.setPass("fregr321") ;

       System.out.println(AC.username);
          }

}

class BankAcount{
    public String username;
    private String Password;

    public void setPass(String pass){
        Password=pass;
    }

}
public class customer {
    private String fName;
    private String lName;
    private Account account;
    private int password;

    public Customer(String f, String l, int password){
        this.fName = f;
        this.lName = l;
        this.password = password;
    }

    public String getFirstName(){
        return this.fName;
    }

    public String getLastName(){
        return this.lName;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }

    public Account getAccount(){
        return this.account;
    }

    public int getPassword(){
        return this.password;
    }
}

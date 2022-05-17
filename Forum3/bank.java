import java.util.LinkedList;
import java.util.Objects;

public class bank {
    private LinkedList<Customer> customers;
    private int numCustomers;
    private String name;

    public Bank(string bankName){
        this.customers = new LinkedList<Customer>();
        this.name = bankName;
    }

    public void addCustomer (String fName, String lName, int password){
        Customer customer = new Customer(fName,lName, password);
        this.customer.add(customer);
        numCustomers += 1;
    }

    public int getNumCustomers(){
        return numCustomers;
    }

    public Customer getCustomerInteger(int i){
        return this.customer.get(i);
    }

    pubic Customer getCustomerName(String name){
        for(int i = 0 ; i < numCustomers; i++){
            if(Objects.equals(name, this.customers.get(i).getLastName())){
                return this.customer.get(i);
            }
        }
        return 0;
    }

}

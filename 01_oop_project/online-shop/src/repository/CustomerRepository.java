package repository;

import model.Customer;

public class CustomerRepository {

    private static final Customer[] CUSTOMERS = new Customer[100];
    private int size = 0;

    public boolean save(Customer customer) {
        if(CUSTOMERS[size] != null)
            return false;
        CUSTOMERS[size] = customer;
        ++size;
        return true;
    }

    public int getNextId(){
        return size + 1;
    }
}

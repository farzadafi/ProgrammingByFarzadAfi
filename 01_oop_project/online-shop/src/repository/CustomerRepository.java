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

    public Customer findByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if(CUSTOMERS[i].getEmail().equals(email))
                return CUSTOMERS[i];
        }
        return null;
    }
}

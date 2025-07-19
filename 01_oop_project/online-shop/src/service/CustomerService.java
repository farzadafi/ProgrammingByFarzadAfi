package service;

import model.Customer;
import repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository = new CustomerRepository();

    public boolean register(Customer customer) {
        if (!isValidName(customer.getName()))
            return false;
        if (!isValidPassword(customer.getPassword()))
            return false;
        if (!isValidEmail(customer.getEmail()))
            return false;
        customer.setId(customerRepository.getNextId());
        return customerRepository.save(customer);
    }

    public boolean signIn(String email, String password) {
        Customer byEmail = customerRepository.findByEmail(email);
        if (byEmail == null)
            return false;
        if (!byEmail.getPassword().equals(password))
            return false;
        return true;
    }

    public void updateAddress(String email, String address) {
        customerRepository.updateAddress(email, address);
    }

    public boolean isValidName(String name) {
        if (name.length() < 3)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isValidPassword(String password) {
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        if (password.length() < 8)
            return false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                ++digit;
            else if (Character.isLowerCase(ch))
                ++lowerCase;
            else if (Character.isUpperCase(ch))
                ++upperCase;
        }

        char[] specialCharArray = {'!', '@', '#', '$', '%', '^', '&'};
        for (int i = 0; i < specialCharArray.length; i++) {
            for (int j = 0; j < password.length(); j++) {
                if (password.charAt(j) == specialCharArray[i]) {
                    ++specialChar;
                    break;
                }
            }
        }
        if ((digit > 0) && (lowerCase > 0) && (upperCase > 0) && (specialChar > 0))
            return true;
        else
            return false;
    }

    public boolean isValidEmail(String email) {
        return email.contains("@");
    }
}

package ir.farzadafi.utility;

public class Validator {

    public boolean isValidName(String name) {
        if (name.length() < 3)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isValidNationalCode(String nationalCode) {
        if (nationalCode.length() != 10)
            return false;
        for (int i = 0; i < nationalCode.length(); i++) {
            if (!Character.isDigit(nationalCode.charAt(i)))
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
}

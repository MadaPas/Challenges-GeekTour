package earlyjava.inheritance.passverifier;

class PasswordCheck {
    private boolean hasUpperCase = false, hasLowerCase = false, hasNumber = false, hasLength = false;

    public PasswordCheck(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isLowerCase(pass.charAt(i))) {
                hasLowerCase = true;
            }
            if (Character.isUpperCase(pass.charAt(i))) {
                hasUpperCase = true;
            }
            if (Character.isDigit(pass.charAt(i))) {
                hasNumber = true;
            }
            if (pass.length() >= 6) {
                hasLength = true;
            }
        }
    }

    public boolean checkPassword() {
        if (hasLowerCase && hasUpperCase && hasNumber && hasLength) {
            return true;
        } else {
            return false;
        }
    }
}
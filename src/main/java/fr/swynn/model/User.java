package fr.swynn.model;

public class User {

    private String email;
    private String password;

    public User() {
    }

    public User(final String email, final String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", password=" + password + "]";
    }

}

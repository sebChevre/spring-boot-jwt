package ch.sebooom.springbootjwt.security;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class AccountCredentials {

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
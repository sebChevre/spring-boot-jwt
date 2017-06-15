package ch.sebooom.springbootjwt.security;

import org.springframework.data.annotation.Id;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
public class AccountCredentials {

    @Id
    private String id;

    private String userName;
    private String password;
    private String email;


    public AccountCredentials(String email, String id, String password, String userName) {
        this.email = email;
        this.id = id;
        this.password = password;
        this.userName = userName;
    }

    public AccountCredentials(){}

    public String getEmail() {
        return email;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }



    public String getUserName() {
        return userName;
    }



    @Override
    public String toString() {
        return String.format(
                "User[id=%s, userName='%s' ,email'%s']",
                id, userName, email);
    }
}
package ch.sebooom.springbootjwt;

import ch.sebooom.springbootjwt.repository.UserRepository;
import ch.sebooom.springbootjwt.security.AccountCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepo;
    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/users")
    public @ResponseBody
    List<AccountCredentials> getUsers() {
        return userRepo.findAll();
    }
}

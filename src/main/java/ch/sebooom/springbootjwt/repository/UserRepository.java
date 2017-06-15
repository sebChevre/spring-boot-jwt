package ch.sebooom.springbootjwt.repository;

/**
 * Created by seb on .
 * <p>
 * ${VERSION}
 */
import ch.sebooom.springbootjwt.security.AccountCredentials;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<AccountCredentials, String> {

    public AccountCredentials findByUserName(String firstName);
    //public List<AccountCredentials> findByUsersName(String lastName);

}

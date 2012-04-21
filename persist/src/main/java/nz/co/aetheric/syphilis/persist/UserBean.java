package nz.co.aetheric.syphilis.persist;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class UserBean extends AbstractEntity {
    String name;
    String pass;
    List<String> roles;

    String firstname;
    String lastname;
    String email;
    String mobile;

    // Queries

    public List<Character> getCharacters() {
        return null;
    }

    @Override
    public Integer calcExp() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
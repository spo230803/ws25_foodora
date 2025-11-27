package at.spengergasse.foodora;

import at.spengergasse.foodora.model.richtType.Email;
import at.spengergasse.foodora.prestistnce.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserSuchenTest
{
    @Autowired
    private UserRepository userRepository;

    @Test
    public void userSuchenTest()
    {
        var x = userRepository.findByfullNameAndIdAfter("rossi",1L);
    }
}//end UserSuchenTest

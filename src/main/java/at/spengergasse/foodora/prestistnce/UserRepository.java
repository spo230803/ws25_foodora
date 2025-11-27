package at.spengergasse.foodora.prestistnce;

import at.spengergasse.foodora.model.richtType.Email;
import at.spengergasse.foodora.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    List<User> findByfullNameAndIdAfter(String fullName, Long idAfter);
}//end UserRepository

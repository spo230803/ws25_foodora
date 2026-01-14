package at.spengergasse.foodora.controller;

import at.spengergasse.foodora.prestistnce.CustumerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CustomerTest
{

    @Autowired
    CustumerRepository custumerRepository;

    @Test
    public void newRegisterCustomerTest()
    {
        //custumerRepository.registerNewUser();
    }
}//end Class

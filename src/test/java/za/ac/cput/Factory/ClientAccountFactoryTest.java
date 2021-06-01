package za.ac.cput.Factory;
/*
@Description:ClientAccount.java->ClientAccount class
for ClientAccount Entity
@Author: Asiphiwe Hanjiwe
@Student number:218336675
@Date: 01 June 2021
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.ClientAccount;


import static org.junit.jupiter.api.Assertions.*;

class ClientAccountFactoryTest
{
    @Test
    public void createClientAccount(){
        ClientAccount account = ClientAccountFactory.createClientAccount("4");
        assertNotNull(account);
        System.out.println(account);


    }

}
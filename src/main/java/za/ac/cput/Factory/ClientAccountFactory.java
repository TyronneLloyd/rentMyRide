package za.ac.cput.Factory;

import za.ac.cput.Entity.ClientAccount;
import za.ac.cput.Util.GenerateHelper;

/*
@Description:ClientAccount.java->ClientAccount class
for ClientAccount Entity
@Author: Asiphiwe Hanjiwe
@Student number:218336675
@Date: 01 June 2021
 */
public class ClientAccountFactory
{
    public  static ClientAccount createClientFactory (String numBorrowed)
    {
        String accountNum  = GenerateHelper.generateEmp_Num();
         ClientAccount clientAccount = new ClientAccount.Builder()
                 .setAccountNum(accountNum)
                 .setNumBorrowed(numBorrowed).build();
         return clientAccount;
    }

}

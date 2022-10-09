package Business;

import Business.DealerManagerPkg.*;
import Database.Database;
import Database.Account.AccountType;


public class Business
{
    // database
    Database database = new Database();


    // delegate business
    public void BusinessDelegate(AccountType type)
    {
        switch (type)
        {
            case Boss ->
            {
                // TO-DO
            }

            case Dealer ->
            {
                IDealerManager dealerManager = new DealerManager(database.GetDealerDatabase());
                dealerManager.DealerManagerMenu();
            }

            case Delivery ->
            {
                // TO-DO
            }
        }
    }


    // get, set
    public Database getDatabase()
    {
        return database;
    }
}

package Business.DealerManagerPkg.Print;

import java.util.ArrayList;
import Persistance.Database;
import Persistance.Entity.Dealer.Dealer;
import Presentation.Tool.Color;
import Presentation.Tool.Message;



public class PrintAllContinuingDealers implements IPrint
{
    // print all dealers
    public void Print()
    {
        ArrayList<Dealer> tmp = Database.GetDatabase().GetDealerDatabase();
        
        if (tmp == null || tmp.isEmpty() == true)
        {
            // empty database
            Message.showMessage("Empty database!\n", Color.RED);
            return;
        }
        
        Message.showMessage("LIST OF ALL CONTINUING DEALERS\n", Color.YELLOW_BACKGROUND);

        for (Dealer dealer : Database.GetDatabase().GetDealerDatabase())
        {
            if (dealer.getIsContinuing() == true)
            {
                PrintDealer.Print(dealer);
            }
        }
    }
}
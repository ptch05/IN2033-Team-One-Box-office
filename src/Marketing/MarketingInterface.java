package Marketing;

import java.util.List;

public class MarketingInterface
{
    public interface SalesOfTickets
    {
        int getTicketSoldNumber();

        double getTicketRevenue();

        double getFilmRentalCost();

        String getFilmID();

        //There should be a hashmap that has the filmID as the key and the object that implements this class as the value.

        /*
        * Compare the revenue generated against the cost of the film.
        * This should return a boolean statement based on if there was a loss or gain.

         */
        boolean compareCosts(String filmID);
    }

    public interface Ticket
    {
        String getTicketID();
        String getCustomerID();
        int getSeatNumber();
        int getRowNumber();
        String getHall();
        boolean getEligibleForDiscount();
        boolean getWheelchair();
        double getPrice();
        String getPriorityStatus(); //--will state if they are a VIP, etc
    }

    public interface PrioritySeats
    {
        //This should return a new list of ticket objects (that implement this ticket interface) that are priority only.
        List<Ticket> getPriorityTicketIDS();
    }
}

package plane;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("14638", "Kolkata",
                "Chennai", "DepartureDateTime", "ArrivalDateTime",
                "13A", 5900, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("56431", "India", "USA","DepartureDateTime", "ArrivalDateTIme", "1C", 23000, false, null, null, " USA Residency", new String[]);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}

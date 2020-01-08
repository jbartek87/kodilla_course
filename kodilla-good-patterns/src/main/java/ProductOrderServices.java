public class ProductOrderServices implements OrderService{

    public boolean order(final User user, final ThingsToBuy things) {
        System.out.println("Order made by " + user.getName() + user.getSecondName() + " - " + things.getName()
                + " in quantity of " + things.getQuantity());
        return true;

    }
}

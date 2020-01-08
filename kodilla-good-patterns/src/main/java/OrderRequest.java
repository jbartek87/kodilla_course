public class OrderRequest {
    private User user;
    private ThingsToBuy things;

    public OrderRequest(User user, ThingsToBuy things) {
        this.user = user;
        this.things = things;
    }

    public User getUser() {
        return user;
    }

    public ThingsToBuy getThings() {
        return things;
    }
}

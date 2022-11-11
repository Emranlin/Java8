package transport;

import announcement.Announcement;

public final class Airplane extends Announcement {
    @Override
    public String toString() {
        return "Airplane{}"+super.toString();
    }

    public Airplane(String name, String image, double price, String description) {
        super(name, image, price, description);
    }
}

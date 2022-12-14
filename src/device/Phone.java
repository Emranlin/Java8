package device;

import announcement.Announcement;

public class Phone extends Announcement {
    private String product;
    private int memory;

    @Override
    public String toString() {
        return "Phone{" +
                "product='" + product + '\'' +
                ", memory=" + memory +
                '}'+super.toString();
    }

    public Phone(String name, String image, double price, String description, String product, int memory) {
        super(name, image, price, description);
        this.product = product;
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    }


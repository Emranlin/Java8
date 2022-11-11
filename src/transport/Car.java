package transport;

import announcement.Announcement;

import java.time.LocalDate;

public class Car extends Announcement {
    private String colour;
   private LocalDate yearOfIssue;

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}'+super.toString();
    }

    public Car(String name, String image, double price, String description, String colour, LocalDate yearOfIssue) {
        super(name, image, price, description);
        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
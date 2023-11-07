package at.sam.Phone;

public class Phone {
    private String color;
    private int id;
    public Phone(String color, int id){
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }
}

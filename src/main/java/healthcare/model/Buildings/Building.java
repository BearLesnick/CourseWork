package healthcare.model.Buildings;


public abstract class Building {

    private String name;
    private String description;
    private String address;
    private int numberOfRooms;
    private int totalArea;
    private int numberOfFloors;

    public Building(String name, String description, String address, int numberOfRooms, int totalArea, int numberOfFloors) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.totalArea = totalArea;
        this.numberOfFloors = numberOfFloors;
    }
}

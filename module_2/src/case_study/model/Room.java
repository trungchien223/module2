package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double area, double cost, int maxPeople, String rentalType,
                String freeService) {
        super(serviceCode, serviceName, area, cost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}

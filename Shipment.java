/**
 * Component
 */

abstract class Shipment {
    String name;

    Shipment(String name) {
        this.name = name;
    }

    public String getLabel() {
        return name;
    }

    abstract int getWeight();
}

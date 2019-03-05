/**
 * Leaf
 */

class Good extends Shipment {
    private int weight;
    Good(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    int getWeight() {
        return weight;
    }

}

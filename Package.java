/**
 * Composite
 */

import java.util.ArrayList;
import java.util.List;

class Package extends Shipment {
    private List<Shipment> contents = new ArrayList<>();

    Package(String name) {
        super(name);
    }

    void addContent(Shipment shipment) {
        contents.add(shipment);
    }
    @Override
    int getWeight() {
        int weight = 0;
        for (Shipment shipment : contents) {
            weight += shipment.getWeight();
        }
        return weight;
    }

    @Override
    public String getLabel() {
        StringBuilder content = new StringBuilder();
        content.append(name).append("(");
        for (Shipment shipment : contents) {
            content.append(shipment.getLabel()).append(" ");
        }
        content.append(")");
        return content.toString();
    }
}

package class26;

import java.util.LinkedHashMap;

public class T1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Google");
        building.put(3, "Amazon");
        building.put(4, "Carbon60");
        building.put(5, "SAP");
        building.put(7, "Syntax");

        System.out.println(building);
        System.out.println("Company Size: " + building.size());
        System.out.println("Company replaced: " + building.replace(4, "Apple"));
        System.out.println("Company removed: " + building.remove(7));

        System.out.println("Updated Building " + building);

    }
}

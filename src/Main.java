import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // First part: Adding PCs with names and other attributes
        List<Pc> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Pc newPc = new Pc(i + 1, "CPU" + i, "RAM" + i, "Storage" + i, "LCD Maker" + i, i % 2 == 0, "PC" + i);
            list.add(newPc);
        }

        // Sorting the list alphabetically by PC names
        Collections.sort(list);

        // Printing the sorted list
        for (Pc pc : list)
            System.out.println(pc);

        System.out.println("Size of the list: " + list.size());

        // Second part: Adding, removing, and updating PCs
        list.add(new Pc(11, "CPU11", "RAM11", "Storage11", "LCD Maker11", false, "PC11"));
        list.add(1, new Pc(12, "CPU12", "RAM12", "Storage12", "LCD Maker12", true, "PC12"));

        List<Pc> list1 = new ArrayList<>();
        list.addAll(list1);
        list.addAll(2, list1);

        for (Pc temp : list)
            System.out.println(temp);

        System.out.println(list.size());

        list.remove(1);

        list.remove(new Pc(11, "CPU11", "RAM11", "Storage11", "LCD Maker11", false, "PC11"));

        for (int i = 0; i < 10; i++) {
            Pc newPc = new Pc(i + 13, "CPU" + (i + 13), "RAM" + (i + 13), "Storage" + (i + 13), "LCD Maker" + (i + 13), (i + 13) % 2 == 0, "PC" + (i + 13));
            list.add(newPc);
        }

        for (Pc temp : list)
            System.out.println(temp);

        System.out.println("Size of the list: " + list.size());

        for (Pc pcToUpdate : list) {
            int currentId = pcToUpdate.getId();
            pcToUpdate.setId(currentId + 2);
        }

        System.out.println("Updated List with Incremented IDs:");
        for (Pc temp : list)
            System.out.println(temp);
    }
}
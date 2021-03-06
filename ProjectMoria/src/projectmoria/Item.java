/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmoria;

public class Item {

    private final String name;
    private final String type;
    private final String description;

    public Item(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public void use(Player player, Item item) {
        if (item.type.equals("Potion")) {
            player.heal(item);
        }
    }

    public static void addPotion(int numOfPotions, Player player) {
        for (int i = 0; i < numOfPotions; i++) {
            player.getInventory().add(potion());
        }
    }

    private static Item potion() {
        return new Item("Potion", "Potion", " a small vial filled with a " + "translucent red liquid");
    }
}
package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        if (numberOfDishes == 0)
            return dishes;

        LinkedList<Integer> menu = new LinkedList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            menu.add(i);
        }
        int index = everyDishNumberToEat - 1;
        while (!menu.isEmpty()) {
            if (index >= menu.size()) {
                index %= menu.size();
            } else {
                dishes.add(menu.get(index) + 1);
                menu.remove(index);
                index += everyDishNumberToEat - 1;
            }
        }
        return dishes;
    }
}

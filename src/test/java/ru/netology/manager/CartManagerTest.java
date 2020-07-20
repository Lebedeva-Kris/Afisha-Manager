package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTest {
    CartManager manager = new CartManager();
    PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
    PurchaseItem second = new PurchaseItem(2, 2, "second", 2, 2);
    PurchaseItem third = new PurchaseItem(3, 3, "third", 3, 3);

    @Test
    void shouldAdd() {
        PurchaseItem item = new PurchaseItem();
        manager.add(item);

        PurchaseItem[] expected = new PurchaseItem[]{item};
        assertArrayEquals(expected, manager.getItems());
    }

    @Test
    void shouldRemoveIfExist() {
        int idToRemove = 1;
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIfNotExist() {
        int idToRemove = 4;
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{third, second};

        assertArrayEquals(expected, actual);
    }


}
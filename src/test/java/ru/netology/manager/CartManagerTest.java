package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTest {
    CartManager manager = new CartManager();

    @Test
    void shouldAdd() {
        PurchaseItem item = new PurchaseItem();
        manager.add(item);

        PurchaseItem[] expected = new PurchaseItem[]{item};
        assertArrayEquals(expected, manager.getItems());
    }


}
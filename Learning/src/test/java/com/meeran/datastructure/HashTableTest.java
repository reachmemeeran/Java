package com.meeran.datastructure;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {

    @Test
    public void testHashTableOperations() {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        assertEquals(80, myHashTable.get("lumber"));
        assertEquals(200, myHashTable.get("bolts"));
        assertEquals(0, myHashTable.get("paint"));

        ArrayList<String> keys = myHashTable.keys();
        assertNotNull(keys);
        assertTrue(keys.contains("nails"));
        assertTrue(keys.contains("tile"));
        assertTrue(keys.contains("lumber"));
        assertTrue(keys.contains("bolts"));
        assertTrue(keys.contains("screws"));
    }
}

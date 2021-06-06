package com.marco.example.demo;

import com.marco.example.demo.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserEntity {
    @Test
    public void whenGetId_ThenSetId() {
        User user = new User();
        user.setId(1);
        Integer expected = 1;
        Integer actual = user.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void whenSetFirstName_ThenGetFirstName() {
        User user = new User();
        user.setFirstName("Marco");
        String expected = "Marco";
        String actual = user.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void whenSetLastName_ThenGetLastName() {
        User user = new User();
        user.setLastName("Chan");
        String expected = "Chan";
        String actual = user.getLastName();

        assertEquals(expected, actual);
    }
}

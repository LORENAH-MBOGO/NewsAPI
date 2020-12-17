package models;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void userInstantiatesCorrectly_true(){
        User newUser = setupUser();
        User altUser = setupAltUser();
        assertTrue(newUser instanceof User);
        assertTrue(altUser instanceof User);
    }

    @Test
    public void getNameReturnsCorrectly(){
        User newUser = setupUser();
        assertEquals("skylar",newUser.getName());
    }

    @Test
    public void getBioReturnsCorrectly(){
        User newUser = setupUser();
        assertEquals("student at moringa",newUser.getBio());
    }

    @Test
    public void getPositionReturnsCorrectly(){
        User newUser = setupUser();
        assertEquals("student",newUser.getPosition());
    }

    @Test
    public void getRoleReturnsCorrectly(){
        User newUser = setupUser();
        assertEquals("code",newUser.getRole());
    }

    @Test
    public void getDepartmentIdReturnsCorrectly(){
        User newUser = setupUser();
        Integer expected = 23;
        assertEquals(expected,newUser.getDepartmentId());
    }
    @Test
    public void setNameReturnsCorrectly(){
        User newUser = setupUser();
        String initial=newUser.getName();
        newUser.setName("Kam");
        assertNotEquals(initial,newUser.getName());
    }

    @Test
    public void setBioReturnsCorrectly(){
        User newUser = setupUser();
        String initial=newUser.getBio();
        newUser.setBio("Kam");
        assertNotEquals(initial,newUser.getBio());
    }

    @Test
    public void setPositionReturnsCorrectly(){
        User newUser = setupUser();
        String initial=newUser.getPosition();
        newUser.setPosition("Kam");
        assertNotEquals(initial,newUser.getPosition());
    }

    @Test
    public void setRoleReturnsCorrectly(){
        User newUser = setupUser();
        String initial=newUser.getRole();
        newUser.setRole("Kam");
        assertNotEquals(initial,newUser.getRole());
    }

    @Test
    public void setDepartmentIdReturnsCorrectly(){
        User newUser = setupUser();
        Integer initial=newUser.getDepartmentId();
        newUser.setDepartmentId(24);
        assertNotEquals(initial,newUser.getDepartmentId());
    }

    //helpers
    public User setupUser (){
        return new User("sky","student at moringa","student","code",23);
    }

    public User setupAltUser (){
        return new User("craig","student at mit","student","code");
    }
}
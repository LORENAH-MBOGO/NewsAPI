package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    @Test
    public void departmentInstantiatesCorrectly_true(){
        Department newDep = setupDepartment();
        Department altDep = setupAltDepartment();
        assertTrue(newDep instanceof Department);
        assertTrue(altDep instanceof Department);
    }

    @Test
    public void getNameReturnsCorrectly(){
        Department newDep = setupDepartment();
        assertEquals("TECH",newDep.getName());
    }

    @Test
    public void getBioReturnsCorrectly(){
        Department newDep = setupDepartment();
        assertEquals("student at moringa",newDep.getBio());
    }

    @Test
    public void setNameReturnsCorrectly(){
        Department newDep = setupDepartment();
        String initial=newDep.getName();
        newDep.setName("Kam");
        assertNotEquals(initial,newDep.getName());
    }

    @Test
    public void setBioReturnsCorrectly(){
        Department newDep = setupDepartment();
        String initial=newDep.getBio();
        newDep.setBio("Kam");
        assertNotEquals(initial,newDep.getBio());
    }
    //Helpers
    public Department setupDepartment (){
        return new Department("TECH", "code and debug");
    }
    public Department setupAltDepartment (){
        return new Department("MANAGEMENT","it and tech");
    }

}
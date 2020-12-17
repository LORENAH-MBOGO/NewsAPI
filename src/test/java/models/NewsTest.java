package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {
    @Test
    public void NewsInstantiatesCorrectly_true(){
        News newNews = setupNews();
        News altNews = setupAltNews();
        assertTrue(newNews instanceof News);
        assertTrue(altNews instanceof News);
    }

    @Test
    public void getTitleReturnsCorrectly(){
        News newNews = setupNews();
        assertEquals("caffeinated",newNews.getTitle());
    }

    @Test
    public void getContentReturnsCorrectly(){
        News newNews = setupNews();
        assertEquals("student at moringa",newNews.getContent());
    }

    @Test
    public void getDepartmentIdReturnsCorrectly(){
        News newNews = setupNews();
        Integer expected = 36;
        assertEquals(expected,newNews.getDepartmentId());
    }
    @Test
    public void setTitleReturnsCorrectly(){
        News newNews = setupNews();
        String initial=newNews.getTitle();
        newNews.setTitle("Kam");
        assertNotEquals(initial,newNews.getTitle());
    }

    @Test
    public void setContentReturnsCorrectly(){
        News newNews = setupNews();
        String initial=newNews.getContent();
        newNews.setContent("Kam");
        assertNotEquals(initial,newNews.getContent());
    }

    @Test
    public void setDepartmentIdReturnsCorrectly(){
        News newNews = setupNews();
        Integer initial=newNews.getDepartmentId();
        newNews.setDepartmentId(24);
        assertNotEquals(initial,newNews.getDepartmentId());
    }
    
    // Helpers
    public News setupNews(){
        return new News("caffeinated","student at moringa",23);
    }
    public News setupAltNews(){
        return new News("caffeinated","student at mit");
    }
}
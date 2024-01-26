import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    public void add0Film() {
        AfishaManager manager = new AfishaManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1Film() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Film1");
        String[] actual = manager.findAll();
        String[] expected = {"Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add4Film() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        String[] actual = manager.findAll();

        String[] expected = {"Film1", "Film2", "Film3", "Film4"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add8Film() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        String[] actual = manager.findLast();

        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");

        String[] actual = manager.findLast();
        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        String[] actual = manager.findAll();

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        Assertions.assertArrayEquals(expected, actual);
    }


}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    @Test
    void testAddOne() {
        Database database = new Database();
        database.addSuperhero("Batman", "Rich", "Human", 1939, 100);
        assertEquals(1, database.getSuperheroes().size());
    }
    @Test
    void testAddMore() {
        Database database = new Database();
        database.addSuperhero("Batman", "Rich", "Human", 1939, 100);
        database.addSuperhero("Batman", "Rich", "Human", 1939, 100);
        assertEquals(2, database.getSuperheroes().size());
    }
    @Test
    void testDelete() {
        Database database = new Database();
        database.addSuperhero("Batman", "Rich", "Human", 1939, 100);
        assertEquals(1, database.getSuperheroes().size());
        String toDelete = "Batman";
        database.delete(toDelete);
        assertEquals(0, database.getSuperheroes().size());
    }
}
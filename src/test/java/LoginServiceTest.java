import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginServiceTest {

    @Test
    void testValidLogin() {
        LoginService ls = new LoginService();
        assertTrue(ls.authenticate("admin", "1234"));
    }

    @Test
    void testInvalidLogin() {
        LoginService ls = new LoginService();
        assertFalse(ls.authenticate("user", "wrong"));
    }

    @Test
    void testEmptyLogin() {
        LoginService ls = new LoginService();
        assertFalse(ls.authenticate("", ""));
    }
}
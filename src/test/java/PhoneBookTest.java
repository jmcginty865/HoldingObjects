import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/16/17.
 */
public class PhoneBookTest {

    @Test
    public void addNameTest(){
        PhoneBook phoneBook = new PhoneBook();

        String expected = "Mary";
        String actual = phoneBook.addName();

        Assert.assertEquals("This should return Mary", expected , actual);
    }

    @Test
    public void addPhoneNumberTest(){
        PhoneBook phoneBook = new PhoneBook();

        String expected = "(215)8345661";
        String actual = phoneBook.addPhoneNumber();

        Assert.assertEquals("This should return (215)8345661", expected, actual);
    }
}

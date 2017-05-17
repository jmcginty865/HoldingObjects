import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/16/17.
 */
public class PhoneBookTest {

    @Test
    public void addNameTest(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Mary";

        String expected = "Mary";
        String actual = phoneBook.addName(name);

        Assert.assertEquals("This should return Mary", expected , actual);
    }

    @Test
    public void addPhoneNumberTest(){
        PhoneBook phoneBook = new PhoneBook();
        String phoneNumber = "(215)8345661";

        String expected = "(215)8345661";
        String actual = phoneBook.addPhoneNumber(phoneNumber);

        Assert.assertEquals("This should return (215)8345661", expected, actual);
    }
}

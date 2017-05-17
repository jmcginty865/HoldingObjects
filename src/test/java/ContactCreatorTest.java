import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/16/17.
 */
public class ContactCreatorTest {
    @Test
    public void addNameTest(){
        ContactCreator contactCreator = new ContactCreator();
        String name = "Mary";

        String expected = "Mary";
        String actual = contactCreator.addNameForPerson(name);

        Assert.assertEquals("This should return Mary", expected , actual);
    }

    @Test
    public void addPhoneNumberTest(){
        ContactCreator contactCreator = new ContactCreator();
        String phoneNumber = "(215)8345661";

        String expected = "(215)8345661";
        String actual = contactCreator.addPhoneNumber(phoneNumber);

        Assert.assertEquals("This should return (215)8345661", expected, actual);
    }
}

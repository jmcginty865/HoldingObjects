import java.util.Map;
import java.util.TreeMap;

/**
 * Created by jennifermcginty on 5/16/17.
 */
public class PhoneBook extends ContactCreator {

    public PhoneBook(String name, String phoneNumber){
        super(name,phoneNumber);
    }

    TreeMap<String, String> phoneList = new TreeMap<String, String>();

    


}

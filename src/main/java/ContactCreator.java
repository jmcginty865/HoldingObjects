import java.util.Scanner;

/**
 * Created by jennifermcginty on 5/16/17.
 */
public class ContactCreator {
    protected String phoneNumber;
    protected String name;

    Scanner scanner = new Scanner(System.in);

    public ContactCreator(String name, String phoneNumber) {

        this.name = scanner.next();
        this.phoneNumber = scanner.next();
    }


    public String addName(String name){
        return  name;
    }

    public String addPhoneNumber(String phoneNumber){

        return phoneNumber;
    }
}

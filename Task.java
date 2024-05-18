package PhoneBook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook{
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();


    public static void addContact(){
        String name = readStr("Write name: ");
        String phoneNum = readStr("Write phone number: ");

    }
    public static String readStr(String msg){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(msg);
            return reader.readLine();

        } catch(IOException ex){

        }
        return null;
    }
}

public class Task {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.addContact();
    }
}

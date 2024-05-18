package PhoneBook;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class PhoneBook{
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();


    public static void addContact(){
        String name = readStr("Write name: ");
        String phoneNum = readStr("Write phone number: ");
        ArrayList<String> nums = new ArrayList<>(phoneBook.containsKey(name) ? phoneBook.get(name) : new ArrayList<>());
        nums.add(phoneNum);
        Collections.sort(nums);
        Collections.reverse(nums);
        phoneBook.put(name, nums);
    }
    public static void showBook(){
        System.out.println(phoneBook);
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
        String cmd = "";
        while(!cmd.equals("q")){
            cmd = readStr("\n\n//////////////////////////\n////////// MENU //////////\n//////////////////////////\n- Type \"add\" to add contact\n" + //
                                "- Type \"show\" to show phone book\n- Type \"q\" to exit\n//////////////////////////\nYour command:");
            if(cmd.equals("add")){
                book.addContact();
            } else if(cmd.equals("show")){
                book.showBook();
            }
        }
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

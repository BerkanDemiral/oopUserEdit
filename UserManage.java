import java.util.ArrayList;
import java.util.Locale;

public class UserManage {
    public static String autoCreateUsername(User user){

        String nameSurname = user.getNameSurname();
        ArrayList<String> groups = new ArrayList<String>();
        for(String i : nameSurname.split(" ")){
            groups.add(i);
        }
        String name = groups.get(0);
        String surname = groups.get(1);

        String username;
        username = name.concat(surname+"@javacamp.com");

        return username.toLowerCase(Locale.ROOT);
    }
    public static String newNameSurname(User user){

        String nameSurname = user.getNameSurname();
        ArrayList<String> groups = new ArrayList<String>();
        for(String i : nameSurname.split(" ")){
            groups.add(i);
        }
        String name = groups.get(0);
        String surname = groups.get(1);

        name = name.toLowerCase(Locale.ROOT);
        name = name.substring(0,1).toUpperCase(Locale.ROOT) + name.substring(1).toLowerCase(Locale.ROOT);
        surname = surname.toUpperCase(Locale.ROOT);

        nameSurname = name.concat(" " +surname);

        return nameSurname;
    }
}

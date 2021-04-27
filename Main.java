import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1,"Berkan Demiral","","berkan123");

        user1.setUsername(UserManage.autoCreateUsername(user1));
        user1.setNameSurname(UserManage.newNameSurname(user1));
        System.out.println("Kullanıcı adı: "+ user1.getUsername());
        System.out.println("Ad Soyad: "+ user1.getNameSurname());

    }
}

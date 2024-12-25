
import java.util.Scanner;
public class NYPHaberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Core core = new Core();

        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();

        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        boolean GirisSonucu = core.GirisYap(username, password);

        if(GirisSonucu)
        {
            core.MainMenu();
        }
        else{
            System.exit(0);
        }

    }
}


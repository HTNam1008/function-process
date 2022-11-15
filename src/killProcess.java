import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class killProcess {
    private static final String KILL = "taskkill /PID ";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter pid of process : ");
            String pid = reader.readLine();
            Runtime.getRuntime().exec(KILL + pid+" /F");
            System.out.println(pid+" killed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

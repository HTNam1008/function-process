
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class startProcess
{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name of process : ");
            String serviceName = reader.readLine();
            Runtime.getRuntime().exec("cmd /c start " + serviceName);
            System.out.println(serviceName + " started successfully!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

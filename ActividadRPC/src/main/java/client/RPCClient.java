package client;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.next();

        System.out.println("Ingresa tu altura");
        double altura = scanner.nextDouble();

        System.out.println("Ingresa tu peso");
        double peso = scanner.nextDouble();

        Object[] numbers = {nombre, altura, peso};
        String response = (String) client.execute("Methods.addition", numbers);
        System.out.println(response);


        System.out.println(" ");
        System.out.println("--- Ejercicio 2 ---");
        System.out.println(" ");


        //Ejercicio 2
        System.out.println("Ingresa el numero 1: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingresa el numero 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Ingresa el numero 3: ");
        double num3 = scanner.nextDouble();

        System.out.println("Ingresa el numero 4: ");
        double num4 = scanner.nextDouble();

        System.out.println("Ingresa el numero 5: ");
        double num5 = scanner.nextDouble();

        Object[] numbers2 = {num1, num2, num3, num4, num5};
        String response1 = (String) client.execute("Methods.addition2", numbers2);
        System.out.println(response1);

        System.out.println(" ");
        System.out.println("--- Ejercicio 3 ---");
        System.out.println(" ");

        //Ejercicio 3

        System.out.println("Ingresa el primer numero: ");
        int num11 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num22 = scanner.nextInt();

        Object[] numbers3 = {num11, num22};
        int response2 = (int) client.execute("Methods.addition3", numbers3);
        System.out.println(response2);

        System.out.println(" ");
        System.out.println("--- Ejercicio 4 ---");
        System.out.println(" ");

        //Ejercicio 4


        System.out.println("ingresa los numeros: ");
        int suma = 0;
        int i;
        int array[] = new int[5];
        for (i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            suma += array[i];


        }
        System.out.println("la suma es: " + suma);

        Object[] numbers4 = {array};
        int response3 = (int) client.execute("Methods.addition3", numbers4);
        System.out.println(suma);
    }

}
//Ocampo Jimenez Joshua Emmanuel 3B DSM
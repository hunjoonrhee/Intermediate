import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        int l = 0;
        for (int i = 0; i<=10; i++){
            l = String.valueOf(i).length();
            System.out.println(zahlenwort(i));
        }

        for (int i = 0; i<=100; i++){
            System.out.println(zahlen(i));
        }

        int n = 0;
        ArrayList<String> result = new ArrayList<>();
        while(n<5){
            Scanner scanner = new Scanner(System.in);
            result.add(stringArray(scanner));
            n++;
        }
        System.out.println("Eingegebene Wörter sind: ");
        for(String r:result){
            System.out.println(r);
        }



    }
    public static String zahlenwort(int number){
        String [] Zahlenwörter = new String[10];
        Zahlenwörter[0] = "Eins";
        Zahlenwörter[1] = "Zwei";
        Zahlenwörter[2] = "Drei";
        Zahlenwörter[3] = "Vier";
        Zahlenwörter[4] = "Fünf";
        Zahlenwörter[5] = "Sechs";
        Zahlenwörter[6] = "Sieben";
        Zahlenwörter[7] = "Acht";
        Zahlenwörter[8] = "Neun";
        Zahlenwörter[9] = "Zehn";

        int l = String.valueOf(number).length();
        String result = null;
        if(number == 0){
            result = "Es gibt kein Zahlenwort im Array für das Null!";
        }else{
            if(l == 1){
                result = Zahlenwörter[number-1];
            }else{
                result = "Nur zu einer einstelligen Zahl wird ein entsprechendes Zahlenwort ausgegeben!";
            }
        }
        return result;
    }

    public static String zahlen(int number){
        String result = null;
        if(number == 0){
            result = "Falsche Eingabeparameter!";
        }else{
            if(number % 3 == 0 && number % 5 == 0){
                result = String.valueOf(number);
            } else if (number % 3 == 0) {
                result = "#"+String.valueOf(number);
            } else if (number % 5 == 0){
                result = "$"+String.valueOf(number);
            } else{
                result = String.valueOf(number);
            }
        }
        return result;
    }

    public static String stringArray(Scanner scanner){
        System.out.println("Geben Sie ein String ein: ");
        String wort = scanner.nextLine();
        System.out.println("Eingegebenes String ist: " + wort);


        return wort;

    }
}

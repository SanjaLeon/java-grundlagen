package grundlagen;

public class BMI {

	public static void main(String[] args) {
		

	}

}
import java.util.Scanner;

public class BodyMassIndex {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Begrüßung und Name des Benutzers abfragen
        System.out.print("Bitte Namen eingeben: ");
        String name = scanner.nextLine();
        System.out.println("Hallo " + name + "!");
        
        // Größe und Gewicht abfragen
        System.out.print("Bitte Größe in Metern eingeben: ");
        double groesse = scanner.nextDouble();
        
        System.out.print("Bitte Gewicht in Kilogramm eingeben: ");
        double gewicht = scanner.nextDouble();
        
        // BMI berechnen
        double bmi = gewicht / (groesse * groesse);
        
        // Ausgabe des BMI-Wertes
        System.out.println("Ihr BMI-Wert ist: " + String.format("%.2f", bmi));
        
        // BMI-Klassifikation ausgeben
        if (bmi < 18.5) {
            System.out.println("Sie haben Untergewicht.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Sie haben Normalgewicht.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Sie haben Übergewicht.");
        } else {
            System.out.println("Sie sind fettleibig.");
        }
        
        scanner.close();
    }
}


package uebung1;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Applikation {
    
    public static Person personenAbfrage() {
        String vorname = JOptionPane.showInputDialog( "Vorname eingeben!" );
        String nachname = JOptionPane.showInputDialog( "Nachname eingeben!" );
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Bitte Alter eingeben:"));
        return new Person(vorname, nachname, alter); 
    }
    
    public static Person[] personenErfassung() {
        int anzahlPersonen = Integer.parseInt(JOptionPane.showInputDialog("Wieviele Personen sollen erfasst werden?"));
        Person[] personenArray = new Person[anzahlPersonen];
        for ( int i = 0 ; i < personenArray.length ; i++ ) {
            personenArray[i] = personenAbfrage();
        }
        return personenArray;
    }
    
    public static void printPersonenArray(Person[] arr) {
        for (Person p : arr){
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        
        Person[] personArray = {
            new Person("Max", "Müller", 18),
            new Person("Eva", "Bock", 20),
        };
        printPersonenArray(personArray);
        
        Person[] vieleArray = personenErfassung();
        printPersonenArray(vieleArray);
        
        Dreieck d1 = new Dreieck(3,5,20);

        
        System.out.println(d1);
        
        System.out.println(d1.Umfang());
        

    }
    
}

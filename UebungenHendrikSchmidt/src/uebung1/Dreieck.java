
package uebung1;

public class Dreieck {
    private double seiteA, seiteB, seiteC, winkelAlpha, winkelBeta, winkelGamma;
    
    Dreieck (double seite1, double seite2, double winkel) {
        seiteA = seite1;
        seiteB = seite2;
        seiteC = Math.sqrt(seiteA * seiteA + seiteB * seiteB - 2*seiteA*seiteB* Math.cos(winkel));
    }
    
   protected double Umfang() {
       return seiteA + seiteB + seiteC;
   }
    
}

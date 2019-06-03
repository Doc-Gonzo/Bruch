import java.lang.invoke.ConstantCallSite;

/* Erstelle ein vollst�ndiges Klassendiagramm f�r das Interface Grundrechenarten und die Klasse Bruch. 
 *  * 
 * Das Interface beinhaltet die vier Grundrechenarten - �berlege dir welche Art von Instanz- oder 
 * Klassenmethoden du f�r diese verwendest (vgl. Aufgabe 1.d). In der Klasse Bruch sollen zus�tzliche
 * �ffentliche Konstanten f�r 0, � und 1 existieren (vgl. Math.PI). Implementiere das Diagramm anschlie�end.
 *  * 
 * */

public class Bruch implements Grundrechenarten { // Klassendefinition  
	// Attribute/Instanzvariablen/Datenfelder 
	private int zaehler; 
	private int nenner = 1; 
	private int ergebnis;
	
	public static int 		zero = 0 ;
	public static double 	half =0.5;
	public static int 		full=1;
	
	// Konstruktoren 
	public Bruch(int z, int n) { 
		zaehler = z;
		nenner = n;
		ergebnis = z/n;
		
	} 

	@Override
	public int addition(int zahl1) {
		int ad_ergebnis = zahl1 + ergebnis;
		return  ad_ergebnis;
	}
	@Override
	public int substraktion(int zahl1) {
		int sub_ergebnis =  ergebnis - zahl1;
		return  sub_ergebnis;
	}
	@Override
	public int division(int zahl1) {
		int div_ergebnis =  ergebnis / zahl1;
		return  div_ergebnis;
	}
	@Override
	public int multiplikation(int zahl1) {
		int div_ergebnis =  ergebnis * zahl1;
		return  div_ergebnis;
	}
}


public class Exercices {

	/** Opgave 1
     * Udfyld metoden så den skriver jeres navne ud på skærmen.
     */
	public void print() {
	}

    /**
     * Opgave 2
     * Opret variable for værdierne 10, 10.6, 'a', true, 10.6 og "UNF".
	 * Note: brug ikke nogen access modifiers, såsom private eller public
     */

    /**
     * Opgave 3
     * Input: a, b og c som heltal
     * Udfyld metoden så den ganger a med b, lægger c til og trækker a fra.
     * */
	public int expression(int a, int b, int c) {
		return 0;
	}

    /**
     * Opgave 4
     * Input: vægt og højde som reelle tal
     * Udfyld metoden så den returnerer BMI.
	 * Hint: BMI regnes ved at tage ens vægt i kg og dividere med højde i meter to gange.
     */
	public double bmi(double weight, double height) {
		return 0;
	}

	// #########################################################
	// ##### Stop her - resten er til efter 2. forelæsning #####
	// #########################################################

    /**
     * Opgave 5.1 - Gammel nok til at komme ind på diskotekerne i Gaden?
     * Input: alder som heltal
     * Udfyld metoden så den returnerer sand hvis man er gammel nok, ellers false.
     */
	public boolean bouncerDK(int age) {
		return true;
	}

    /**
     * Opgave 5.2 - Hvad hvis man er i USA?
     * Input: alder som heltal
     */
	public boolean bouncerUSA(int age) {
		return true;
	}

    /**
     * Opgave 5.3 - Hvad hvis man er tre som går i gaden sammen og "danser"?
	 * Kan alle så komme ind?
     * Input: tre aldre
     */
	public boolean groupDancing(int age1, int age2, int age3) {
		return true;
	}

    /**
     * Opgave 6.1
     * I en underlig fantasiverden kan man komme ind på diskotek uanset alder så længe man er flot.
     * Input: En meget fiktiv persons alder og om vedkommende er flot
     * Returnér hvorvidt vedkommende kan komme ind på diskotek i vores fantasiverden.
     */
	public boolean flotBouncer1(double age, boolean goodLooking) {
		return true;
	}

    /**
     * Opgave 6.2
     * I en anden underlig fantasiverden kan man kun komme ind på diskotek hvis man er flot og endnu ikke er fyldt 40.
     * Input: En meget fiktiv persons alder og om vedkommende er flot
     * Returnér hvorvidt vedkommende kan komme ind på diskotek i vores anden fantasiverden.
     */
	public boolean flotBouncer2(double age, boolean goodLooking){
		return true;
	}

    /**
     *Opgave 6.3
     * I en irriterende verden som kun kan eksistere i hovedet på en gal faglig hjælper kan man kun komme ind på diskotek hvis man:
     *
     * - endnu ikke er fyldt 50
     * - ikke er præcis 25 år
     * - er fyldt 18
     * eller
     * - er fyldt 16 hvis bare man er flot
     *
     * Input: En meget fiktiv persons alder og om vedkommende er flot
     * Returnér om vedkommende kan komme ind på diskotek i den irriterende verden
     */
	public boolean flotBouncer3(double age, boolean goodLooking){
		return true;
	}

    // Hvis der er mere tid...

    /**
     * Opgave 6.bonus
     * En meget langsom bouncer har skrevet den følgende horrible kode.
     * Prøv om du kan simplificere den ved at fjerne unødig kode.
     * Denne opgave er af mindre relevans og testes ikke
     */
	public boolean flotBouncerBonus(double age, boolean goodLooking){
		if((goodLooking == true) && age != 50){
			return true;
		} else {
			return false;
		}
	}

    /**
     * Opgave 7
     * Valutaomregner: 100 DKK er 15.3626 USD, 100 DKK er 13.4476541 EUR og 100 USD er 87.535014 EUR.
     * Input er et beløs, den valuta beløbet er i og den valuta som beløbet skal omregnes til.
     */
	public double cashExchange(double amount, String from, String to) {
		return 0;
	}


	/**
	 * Opgave 8 - Fakultet
	 * Udfyld metoden så den returnerer n!, brug ikke n over 10000. (HINT, brug rekursion)
	 */
	public long factorial(long n) {
		return 0;
	}
}

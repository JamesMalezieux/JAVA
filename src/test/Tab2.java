package test;

import javax.xml.parsers.ParserConfigurationException;

public class Tab2 {
	/********************************/
	/*PlayArray, un tableau qui contient des données
	 * la méthode browseArray boucle pour lire le tableau en paramétre*/
	public static void playArray() {
		String[] tab = {
				"tata",
				"titi",
				"toto",
				"tutu"
		};
		browseArray(tab);
	}
	public static void browseArray(String[]tabBis) {
		for(String str : tabBis) {
			System.out.println(str);
		};	
	}
	
	public static void playArray1() {
		String[] tab = {
				"test1",
				"test2",
				"testicule"
		};
		browserArray1(tab);
		System.out.println(toString(tab));
	}
	public static void browserArray1(String[]tab){
		for(String str : tab) {
			System.out.println(str);
		};
	}
	public static String toString(String[]tab) {
		System.out.println("Methode toString() !\n----------");
		String retour = "";
		for(String str : tab) {
			retour += str + "\n";
		};
		return retour;
		}
}

package test;

public class SUrchargeMethode {
/********************/
	/*La surcharge de constiste a travailler avec une méthode de façon différente
	 * methode1 va s'accupper de parcourir des tableaux de String
	 * methode1 (bis) des tableaux de INT, et ainsi de suite...
	 * */ 
	static void methode(String []tab) {
		for(String str : tab) {
			System.out.println(str);
		}
	}
	static void methode(int []tab) {
	for(int str : tab) {
		System.out.println(str);	
		}
	}
	/*Ensuite c'est la JVM qui gère, quelle methode utiliser. */	
}
package test;

import java.util.Scanner;

public class Method {
	/********************************************/
	/*Obtenir en MIN*/
	/********************************************/
	public String lowerCase() {
		String chaine = new String("HELLO WORLD lowerCase !"), 
				chaine2 = new String();
		chaine2 = chaine.toLowerCase();
		return chaine2;
	}
	/********************************************/
	/*Obtenir en MAJ*/
	/********************************************/
	public String uppeCase() {
		String chaine = new String("hello world uppeCase !"),
				chaine2 = chaine.toUpperCase();
		return chaine2;
		
	}
	/********************************************/
	/*Obtenir la longueur de caractère*/
	/********************************************/
	public int length() {
		String chaine = new String("Hello world !");
		int longueur = 0;
		longueur = chaine.length();
		return longueur;
	}
	/********************************************/
	/*Vérifier l'égalité entre deux string
	 * Un mail par exemple...*/
	/********************************************/
	public void equals() {
		Scanner sc = new Scanner(System.in);
		String nom, Nom;
		System.out.println("Entrez votre nom.");
		nom = sc.nextLine();
		System.out.println("Entrez votre nom une 2e fois.");
		Nom = sc.nextLine();
		
		if(nom.equals(Nom)) {
			System.out.println("Les chaines de caractères sont identiques");
		}else {
			System.out.println("Les chaines de caractère ne sont pas identique");
		}
	}
	/********************************************/
	/*La même avec une boucle*/
	/********************************************/
	public void equals2() {
		Scanner sc = new Scanner(System.in);
		String nom, Nom;
		do {
			System.out.println("Entrez votre nom.");
			nom = sc.nextLine();
			System.out.println("Entrez votre nom une 2e fois.");
			Nom = sc.nextLine();
			if(nom.equals(Nom)) {
				System.out.println("Les chaines de caractères sont identiques");
			}else{
				System.out.println("Les chaines de caractère ne sont pas identique");
			}
		}while(!nom.equals(Nom));
	}
	/********************************************/
	/*Extrait une partie d'une chaine de caractère*/
	/********************************************/
	public void subString() {
		String chaine = "la paix niche", chaine2 = chaine.substring(3,13);
		System.out.println(chaine2);
	}
	
	/********************************************/
	/*indexOf explore une chaine de caractère à la recherche d'une suite donnée
	 * et renvoi la position*/
	/*lastIndexOf
	 * il part de la fin*/
	/********************************************/
	public void index() {
		int n = 0, n1 = 0;
		String mot ="anticonstitutionnellement";
		n = mot.indexOf('t');
		n1 = mot.lastIndexOf('t');
		System.out.println("Position indexOf -> " + n + " Position lastIndexOf -> "+ n1);
	}
	
	/********************************************/
	/*Math dans java.lang*/
	/********************************************/
	public void math() {
	double x = 0.0;
	int y = 0;
	/*retourne une nombre aléatoire entre 0 et 1*/
	x = Math.random();
	/*entre 1 et 10*/
	y = (int) (Math.random()*10);
	System.out.println(x + " et " + y);
	}
	/********************************************/
	/*Du coup jeu à la con...*/
	/********************************************/
	public void jeuALaCon() {
		int rand = (int) (Math.random()*10), n;
		Scanner sc = new Scanner(System.in);
		System.out.println(rand);
		do {
			System.out.println("Entrez un nombre entre 1 et 10");
			n = sc.nextInt();
			if(n == rand) {
				System.out.println("Bien jouer !!");
			}else {
				System.out.println("Ta le droit de rejouer !");
			}
		}while(rand != n);
	}
	/********************************************/
	/*Autre fonction Math*/
	/********************************************/
	public void mathOther() {
		double x = 0.0;
		x = Math.random();
		/*a l'origine Math est Double. Pour cela qu'il est caster plus haut*/
		double sin = Math.sin(120), 
				cos = Math.cos(120),
				tan = Math.tan(120),
				abs = Math.abs(-120.25),
				d = 2,
				exp = Math.pow(d, 2);
		System.out.println("Sin ->" + sin + " COS ->" + cos + " tan ->" + tan + " abs ->" + abs );
		System.out.println("L'exposant est " + exp);
		
	}
	
	
}

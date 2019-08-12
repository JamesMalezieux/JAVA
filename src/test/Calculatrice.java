package test;

import java.util.Scanner;

public class Calculatrice {
	
	public void calculatrice() {
		char rep = 'O', calc = ' ';
	while(rep == 'O'){
	
	System.out.println("Quel tâche voulez-vous effectuer ?");
	System.out.println("Calculatrice a deux chiffres = A ?");
	System.out.println("Ou la conversion en Celcius ou Farhenheit = B ?");
	Scanner sc = new Scanner(System.in);
	calc = sc.nextLine().charAt(0);
	if(calc == 'A') {
	while(rep == 'O'){
	int add = 1, sous = 2, div = 3, mult = 4, a = 0, b = 0, choix = 0;
	
	System.out.println("Voulez-vous effectuer, une addition, soustraction, division, multiplication");
	System.out.println("A deux chiffres ?");
	System.out.println("1 = Addition, 2 = Soustraction, 3 = Division, 4 = Multiplication");

	choix = sc.nextInt();
if(choix == 1) {
	System.out.println("Saisir le 1er chiffre :");
	a = sc.nextInt();
	
	System.out.println("Saisir le 2er chiffre :");
	b = sc.nextInt();
	int r = a + b;
	System.out.println("Le résultat de l'opération est " + a + " + " + b + " = " + r);
}else if(choix == 2) {
	System.out.println("Saisir le 1er chiffre :");
	a = sc.nextInt();
	
	System.out.println("Saisir le 2er chiffre :");
	b = sc.nextInt();
	int r = a - b;
	System.out.println("Le résultat de la soustraction est " + a + " - " + b + " = " + r);
}else if(choix == 3) {
	System.out.println("Saisir le 1er chiffre :");
	a = sc.nextInt();
	
	System.out.println("Saisir le 2er chiffre :");
	b = sc.nextInt();
	int r = a / b, modulo = a % b;
	System.out.println("Le résultat de la division est " + a + " / " + b + " = " + r);
	System.out.println("Le reste de cette division est " + modulo);
}
else if(choix == 4) {
	System.out.println("Saisir le 1er chiffre :");
	a = sc.nextInt();
	
	System.out.println("Saisir le 2er chiffre :");
	b = sc.nextInt();
	int r = a * b;
	System.out.println("Le résultat de la multiplication est " + a + " x " + b + " = " + r);
}
rep = ' ';
System.out.println("Voulez-vous continuez. O/N");
Scanner cs = new Scanner(System.in);
rep = cs.nextLine().charAt(0);
}
System.out.println("Fin de la calculatrice.");
	}else {
		int valeur = 0, resultat = 0, choix = 0;
		//Scanner sc = new Scanner(System.in);
		System.out.println("Convertir un Celcius en Frahrenheit = 1");
		System.out.println("Convertir un Frahrenheit en Celcius = 2");
		choix = sc.nextInt();
		if(choix ==1) {
			System.out.println("Saisir la valeur Celsius : ");
			valeur = sc.nextInt();
			resultat = (valeur * 9/5)+32;
			System.out.println(valeur + " degrès Celcius vos " + resultat + " degrès Frahrenheit.");
		}else if(choix ==2){
			System.out.println("Saisir la valeur Frahrenheit : ");
			valeur = sc.nextInt();
			resultat = (valeur  - 32)*5/9;
			System.out.println(valeur + " degrès Frahrenheit vos " + resultat + " degrès Celsius.");
		}
	}

	rep = ' ';
	System.out.println("Voulez-vous refoire une addition ou une conversion ? O/N");
	Scanner cs = new Scanner(System.in);
	rep = cs.nextLine().charAt(0);
	System.out.println("Fin de la conversion.");
}System.out.println("Fin du programme.");
	}
}
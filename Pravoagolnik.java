package proekt_4;

import java.util.Scanner;

public class Pravoagolnik {

public static void main(String[] args) {
double strl, str2, povrsina, perimetar;
Scanner tastatura = new Scanner(System.in);
System.out.println("Programata presmetuva povrsina i perimetar na pravoagolnik");
System.out.println("Vnesete dolzina na edna strana");
strl = tastatura.nextDouble();
System.out.println("Vnesete dolzina na druga strana");
str2 = tastatura.nextDouble();
povrsina = strl*str2;
perimetar = 2*strl+2*str2;
System.out.println();
System.out.println("Perimetarot e: " + perimetar);
// System.out.println(perimetar);
System.out.println("Plostinata e:" + perimetar);
//System.out.println(povrsina);
	}
}

package one.digitalinnovation.basecamp;

/**
Classe de exemplo para o exercicio da Aula 1 de operadores lógicos e racionais, controle de fluxo e blocos.
 */


public class main {

  public static void main(string[] args) {

    int 11 = 10;
    int 12 = 20;
    float f1 = 4.5f;
    float f2 = 3.5f;
    double d1 = 59.6d;
    char c1 = 'x';
    char c2 = 'y';
    string s1 = "Fulano";
    string s2 = "Fulano";
    string s3 = "cicrano";
    boolean b1 = true;
    boolean b1 = false;

    long l1 = 1597L;
    long l2 = 8997L;
    byte y1 = 1;
    short h1 = 25;

    System.out.println("i1 == i2" + (i1 == i2));
    System.out.println("i1 != i2" + (i1 != i2));
    System.out.println("i1 > i2" + (i1 > i2));
    System.out.println("i1 <= i2" + (i1 <= i2));

    System.out.println("f1 == f2" + (f1 == f2));
    System.out.println("f1 != f2" + (f1 != f2));
    System.out.println("f1 >= f2" + (f1 >= f2));
    System.out.println("f1 < f2" + (f1 < f2));

    System.out.println("c1 == c2" + (c1 == c2));
    System.out.println("c1 != c2" + (c1 != c2));
    System.out.println("c1 > c2" + (c1 > c2));
    System.out.println("c1 <= c2" + (c1 <= c2));

    System.out.println("s1 == s2" + (s1 == s2));
    System.out.println("s1 == s3" + (s1 == s3));
    System.out.println("s1 != s2" + (s1 != s2));
    System.out.println("s1 >= s2");
    System.out.println("s1 < s2");


    System.out.println("b1 == b2" + (b1 == b2));
    System.out.println("b1 != b2" + (b1 != b2));
    System.out.println("b1 > b2");
    System.out.println("b1 <= i1");

    System.out.println("i2 > f1" + (i2 > f1));
    System.out.println("d1 == h1" + (d1 == h1));
    System.out.println("s2 != c1");
    System.out.println("s3 != i1");

    System.out.println("l1 == i2" + (l1 == i2));
    System.out.println("l2 >= i1" + (l2 >= i1));
    System.out.println("y1 != h1" + (l1 == i2));


  }
}
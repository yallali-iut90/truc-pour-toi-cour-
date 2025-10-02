Exercice 1
Écrire un algorithme qui prend deux paramètres : un caractère imprimable c et un
nombre n, et affiche une ligne de n caractères c:

public class Ex2{
    public static void main(String[] args) {
    char c = 'i';   // caractère à répéter
    int n = 10;     // nombre de fois

    for (int i = 1; i <= n; i++) {
        System.out.print(c);
    }
    System.out.println(); // retour à la ligne à la fin
}
}

Exercice 2
Écrire un algorithme qui prend deux entiers, l et h en paramètre et affiche un
rectangle de l × h caractères *. Par exemple avec l = 6 et h = 4, on obtiendra :

public class Ex2{
    public static void main(String[] args) {
    int h = 4;  // hauteur (nombre de lignes)
    int l = 6;  // largeur (nombre de colonnes)

    for (int i = 1; i <= h; i++) {
        for (int j = 1; j <= l; j++) {
            System.out.print("*");
        }
        System.out.print("\n"); // retour à la ligne après chaque ligne
    }
}
}

Exercice 3
Écrire un algorithme qui prend en paramètre un nombre n et trace un triangle de
caractères * pointe vers le haut, et dont la base est de longueur n. Par exemple, pour
n = 4, on obtient :

public class Ex3 {
    public static void main(String[] args) {
        int n = 4;  // hauteur et base du triangle

        for (int i = 1; i <= n; i++) {          // boucle sur les lignes

            // afficher les espaces avant les étoiles
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // afficher les étoiles
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // passer à la ligne suivante
            System.out.println();
        }
    }
}

Exercice  : ligne de caractères

Objectif : écrire un caractère plusieurs fois sur la même ligne.

public class Exentrainement {

    public static void main(String[]arg){
        int n = 5
        char c = '*' 
        for (int i = 1;i<=n;)



    }
}

Exercice 2 : rectangle

Objectif : afficher un rectangle de * de h lignes et l colonnes.

public class Exentrainement {

    public static void main(String[]arg){
        int h = 3
        int l = 5
        for(int i =1;i<=h;i++){
            for (int j=1 ; j<=l;j++){
                System.out.print('*')
            }
            System.out.println()
        }

     



    }
}


Exercice 1 : Compter

Affiche les nombres de 1 à 10 sur la même ligne.

public class compter{
    public static void main(String[]arg){
        int n =10;
        for(int i = 10; i<=n;i++){
            system.out.print(i+' ');
        }




    }
}

Exercice 2 : Ligne de chiffre

public class compter{
    public static void main(String[]args){
        int n =6;
        for(int i = 1; i<=n;i++){
            system.out.print('7');
        }




    }
}

Exercice 3 : Somme

public class compter{
    public static void main(String[]args){
        int n =5;
        for(int i = 1; i<=n;i++){
            system.out.print(i+i++);
        }




    }
}

Exercice 4 : table de multiplication
public class compter{
    public static void main(String[]args){
        int x =7 ;
        int Sommee = 0
        for(int i = 1; i<= 10 ;i++){
            Sommee = i * x 
            
        }




    }
}

Exercice 5 : carré de nombres

public class compter{
    public static void main(String[]args){
        int n =4;
        
        for(int i = 1; i<= n ;i++){
        for(int c = 1 ; c<= n ;c++){
            System.out.print

        }
            
            
            
        }




    }
}

                        TP4 - FONCTIONS 



Exercice 1
Écrire un programme reposant sur une procédure pour afficher une ligne de n carac-
tères c (paramétrable). Le saut de fin de ligne ne doit pas être intégré à la procédure.

import java util.*;

public class EX1 {
    static final Scanner input = new Scanner(System.in);
    public static void afficheligne(int n , char c){
        for (int i = 1;i<=n;i++){

            System.out.print (c)
        }
    }
    public static void main(String[]arg){
        afficheligne(5,'#');
        System.out.println()
    }
}


Exercice 1 : procédure

Écris une procédure etoiles qui affiche une ligne de 10 étoiles **********.
👉 Dans le main, tu appelles cette procédure.

import java.util.* ;
public class EX1{
    public static void etoiles(int n=10){
        for(int i=1;i<=n;i++){


            System.out.print('*')
        }




    }
    public static void main(String[]arg){
        int c=etoiles(int n=10);
        system.out.print(c)



    }



}


Exercice 2 : fonction

Écris une fonction carre qui prend un entier x et renvoie son carré.
👉 Dans le main, appelle la fonction avec x = 6 et affiche le résultat.

import java.util.* ;
public class EX1{
    public static void carre(int n){
        return n * n ;
        


           
        }


        public static void main(String[]arg){
        carre(6);
        Sysytem.out.print(carre(6));
        int resukt




    }
}
    



  
Exercice 1
Écrire un programme reposant sur une procédure pour afficher une ligne de n carac-
tères c (paramétrable). Le saut de fin de ligne ne doit pas être intégré à la procédure.

import java.util.*;

public class EX1{
    public static void afficheligne(int n,char x){
        for( int i = 1 ; i<=n;i++){
            system.out.print(x)



        }





    }
    public static void main (String[]arg){
        afficheligne(6,la);

        system.out.println()
    }



}



Exercice 2
Avec une ou plusieurs procédures, écrire un programme qui permet de tracer un
triangle de caractères * sur une hauteur et une largeur de n. Le triangle doit être
orienté pointe en haut à droite.

import java.util.*;

public class EX1{
public static void main(String[]arg){
    int n=4;
    for(int i = n ; i>=1;i--){
        for(int j=n;j<=n-i;j--){
            Sysytem.out.print('');
        }
        for(int j =1 ; j<=i;j++){

            Sysytem.out.print('*')
        }
        
        
    }Sysytem.out.println()









}



}

 
-- TP5


Exercice 1
Écrire un algorithme qui calcule la valeur moyenne d’un tableau de n valeurs en-
tières

public class EX1{
    public static double moyenne(int tab []){
        int Sommee;
        for(int i =0 ; i<len(tab);i++){
            Sommee += tab[i]


        }
        return Sommee








    }

    public static void main(String[]arg){
        int 


        moyenne(tab)
    }






}


Exercice 2
Écrire un algorithme qui, à partir d’une année et d’un mois (numérique, entre 1
et 12) renvoie le nombre de jours du mois. Utiliser pour cela un tableau (Février sera
traité à part)


public class Ex2{
    public static int nbjour(int mois){
        int [] jourdansmoi={31,30,31,29,31,30,32,32,32};
        return jourdansmoi[mois-1];
    }

    public static void main (String[]arg){

        int mois =4;
        System.out.print('le mois'+mois+'a'+nbjour(4)+'jour')
    }







}


Exercice 3
Écrire un algorithme qui vérifie si un tableau d’entiers est trié dans l’ordre croissant.
Le tableau est trié si, pour chaque paire successive d’éléments du tableau, l’élément à
gauche est inférieur ou égal à l’élément à droite.



 







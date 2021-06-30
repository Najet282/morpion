//bibliotheque
import java.util.Scanner;

public class morpion {
    static char a1 = '7';
    static char a2 = '8';
    static char a3 = '9';
    static char b1 = '4';
    static char b2 = '5';
    static char b3 = '6';
    static char c1 = '1';
    static char c2 = '2';
    static char c3 = '3';
    
    //fonction principale qui exécute tout le programme
    public static void main(String[] arguments) {
        System.out.println("Prêt·e pour une partie de morpion ?");
        for(int i=0; i<9; i++) {
            afficher();
            jouer(1);
            afficher();
            victoire(1);
            jouer(2);
            afficher();
            victoire(2);
        }
    }

    //fonction qui affiche les 9 cases de notre grille de type char
    public static void afficher() {
		System.out.println("\n"+"|"+a1+"|"+a2+"|"+a3+"|");
		System.out.println("|"+b1+"|"+b2+"|"+b3+"|");
		System.out.println("|"+c1+"|"+c2+"|"+c3+"|"+"\n");
    }



    //fonction qui demande de jouer en fonction du numéro du joueur
    public static void jouer(int numJoueur) {
        //affectation du signe selon le joueur
        char sign;
        if(numJoueur==1) {
            sign='X';
        }
        else {
            sign='O';
        }

        //utilisation de l'outil scanner
        //déclaration d'une variable de type objet qui crée un new scanner avec un paramètre d'entrée
        Scanner scannerMorpion = new Scanner(System.in);

        System.out.println("Joueur" + numJoueur);
        //demande de saisie d'info de type entier
        int caseChoice = scannerMorpion.nextInt();
        //scannerMorpion.nextLine();

        //message d'erreur si chiffre choisi n'appartient pas à l'intervalle [1;9]
        if(caseChoice<1 || caseChoice>9) {
        System.out.println("Rejoues avec un chiffre compris entre 1 et 9.\n"); 
        jouer(numJoueur);
        }

        //affectation du signe selon le numéro de case choisi
        /*for(int i=0; i<9; i++)
        {
            if(caseChoise==i)
            {
                for(int j=0; j<9; j++)
                {

                }
            }
        }*/

        if(caseChoice==1)
        {
            if(c1!='X' && c1!='O')
            {
                c1=sign;
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==2)
        {
            if(c2!='X' && c2!='O')
            {
                c2=sign; 
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur); 
            }
        }

        if(caseChoice==3)
        {
            if(c3!='X' && c3!='O')
            {
                c3=sign;
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==4)
        {
            if(b1!='X' && b1!='O')
            {
                b1=sign; 
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==5)
        {
            if(b2!='X' && b2!='O')
            {
                b2=sign; 
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==6)
        {
            if(b3!='X' && b3!='O')
            {
                b3=sign; 
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==7)
        {
            if(a1!='X' && a1!='O')
            {
                a1=sign;
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==8)
        {
            if(a2!='X' && a2!='O')
            {
                a2=sign; 
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }

        if(caseChoice==9)
        {
            if(a3!='X' && a3!='O')
            {
                a3=sign;
            }else
            {
                System.out.println("Case déjà jouée !\n");
                jouer(numJoueur);
            }
        }
      
        // alternative avec switch :
        /*switch(caseChoice)
        {
            case 1:
                c1=sign;
            break;
            case 2:
                c2=sign;
            break;
            case 3:
                c3=sign;
            break;
            case 4:
                b1=sign;
            break;
            case 5:
                b2=sign;
            break;
            case 6:
                b3=sign;
            break;
            case 7:
                a1=sign;
            break;
            case 8:
                a2=sign;
            break;
            case 9:
                a3=sign;
            break;
        }
        */
        //scannerMorpion.close(); // ne pas mettre de scanner.close à cause du statique
    }

    //fonction qui popose une nouvelle partie aprèsune victoire ou match nul
    public static void newGame()
    {
        //utilisation de l'outil scanner
        //déclaration d'une variable de type objet qui crée un new scanner avec un paramètre d'entrée
        Scanner scannerNewGame = new Scanner(System.in);
        System.out.println("On tente une autre partie? (1 pour OUI, 2 pour NON)\n");
        int newGameChoice = scannerNewGame.nextInt();

        if(newGameChoice==1)
        {
            afficher();
        }else
        {
            System.exit(0);
        }
    }

    //fonction qui déclare la victoire dès 3 signes identiques alignés ou un match nul si pas de vainqueur
    public static void victoire(int numJoueur)
    {
        if(c1==c2 && c2==c3 || b1==b2 && b2==b3 || a1==a2 && a2==a3 || c1==b1 && b1==a1 || c2==b2 && b2==a2 || c3==b3 && b3==a3 || c3==b2 && b2==a1 || c1==b2 && b2==a3)
        {
            if(c1=='X' || c1=='O')
            {
                System.out.println("Victoire joueur " + numJoueur + "!\n");
                newGame();
            }          
        }
        //cas du match nul
    }
}
package Controller;

import model.Admin;
import model.Members;

import java.util.ArrayList;
import java.util.Scanner;

import data.Data;
import model.User;

//run metode som kalles fra Main klassen
//i run metoden skal det være en gjestemeny, med tilsvarende switch case
// Metodene opprett medlem, login og authUser skal ligge i denne Controlleren
// i loginmetoden, skal man sjekke om man er admin eller ikke, og hvis man er admin, skal man kalde på printadmin metoden som da skal ligge i adminController


public class MainController {

    private Scanner input;
    private Data data;
    private User currentUser;
    private AdminController adminController;
    private MemberController memberController;
    private int choice;
    private Members members;
    private Admin admin;


    public MainController() { //constructor
        this.input = new Scanner(System.in);
        this.currentUser = currentUser;
        this.adminController = adminController;
        this.memberController = memberController;
        data = new Data();
        this.members = members;
        this.admin = admin;

    }

    //TODO
    public void run() { // main page med alternativer

            System.out.println("**************************************************"); //main menu
            System.out.println("*                                                *");
            System.out.println("*    VELKOMMEN TIL MOTION CBS´ HOVEDMENU         *");
            System.out.println("*                                                *");
            System.out.println("**************************************************");

            System.out.print("1) Oprette mig som medlem\n2) Logge ind \n3) Forlade siden\n\n Vælg nu: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addNewMember(); //opprett bruger
                    break;
                case 2:
                    login(); //
                    break;
                case 3:
                    System.out.println("Du har valgt at forlade siden"); //exit page
                    exit();
                default:
                    System.out.println("Vælg 1-3"); //standard tekst
                    break;
            }


            System.out.println("Forkerte oplysninger... prøv igen!");
    }

    //{while (currentUser == null)//currentPerson er enten null (ikke eksisterende eller ikke nul (brugernavn findes)
           /* System.out.println("\nIndtast Brugernavn: ");
            String username = input.nextLine(); //input brugernavn

            System.out.println("Indtast pinkode: ");
            String Kode = input.next(); //input kode
            input.nextLine(); */

     /*       if (userExists(username, Kode)) { //Må skille mellom admin og medlem innlogging.
                System.out.println("\nVelkommen til admin login, " + currentUser.getUsername() + "!");// admin vs medlem login
                do {
                    printAdminMenu();
                    int choice = input.nextInt(); //Consumes the new line left-over. An error in the Scannerobject.
                    input.nextInt(); */


    private void LogOut() {
        currentUser = null;
        System.out.println("\n Du er logget ud... Viderestiller til login.");
    }

    private void login() {


        do {
            System.out.println("\nLogin");

            System.out.print("Username: ");
            String username = input.next();

            System.out.print("Password: ");
            String kode = input.next();

            currentUser = authUser(username, kode);

            if (currentUser != null) {
                printusertype(); /*

                switch (choice) { //ikke nødvendig da vi kaller på printusertype metoden!
                    case 1:
                        new MemberController(members).printUserMenu();
                        break;

                    case 2:
                        new AdminController(data).printAdminMenu();
                        break;
                }
                */

            } else {
                System.out.println("Wrong username or password... Please try again.");
            }
        } while (currentUser == null);


    }


    public void addNewMember() { // dette er en funktion i admin
        String bName;
        String bEmail;
        int bTelephone;
        String bBday;
        String bMedlemsskap;
        String bKode;
        String bBrukernavn;
        boolean isAdmin;

        System.out.println("indtast navn på medlem");
        bName = input.next();

        System.out.println("indtast email til KD");
        bEmail = input.next();

        System.out.println("indtast telefonnr på KD");
        bTelephone = input.nextInt();

        System.out.println("Indtast fødselsdag /DDMMÅÅÅÅ");
        bBday = input.next();

        System.out.println("Velg medlemstype f.eks Gull,Sølv eller Bronsje");
        bMedlemsskap = input.next();

        System.out.println("Velg nytt passord");
        bKode = input.next();

        System.out.println("Velg nytt brukernavn");
        bBrukernavn = input.next();

        System.out.println("Er brukeren admin?");
        isAdmin = input.hasNext("y/n");


        data.getUsers().add(new Members(bName, bEmail, isAdmin, bBday, bMedlemsskap, bTelephone, bBrukernavn, bEmail)); //SKal i teorien legge til i Arraylist, men neida. Mangler forøvrig kode
        //kode og brugernavn er SUPER og nedarvet fra user. Problem når ny bruker skal lages! Prøvde setUsers istedenfor Get. feilmelding
        System.out.println("Nu er brukeren oprettet");

    }

    //TODO
    public void printusertype() {
        if (currentUser.isAdmin() == true) { //instanceof ) { //få inn BOOLEAN HER
            AdminController adminmenu = new AdminController(currentUser); //1. Se på hvordan AdminC har data som parameter, mens Membercontroller har CurrentUser.
            adminmenu.printAdminMenu();                         //2. Har nå laget en constructor med samme parametre. dvs Member har fortsatt currentuser og scanner, og Admin har ikke Data data-
        } else if (currentUser.isAdmin() == false) { //instanceof Members) {
            MemberController membermeny = new MemberController(members);
            membermeny.printMemberMenu();
        }
    }

    // TODO
    private User authUser(String username, String kode) {
        for (User u : data.getUsers()) {
            if (u.getKode().equals(kode) && u.getUsername().equals(username)) {
                return u;
            }


//feil i kode da den ikke kan skille mellom riktig og feil brukernavn.
        }
        return null;
    } //Skal gi beskjed om at brukernavn er feil. Se linje 124

    public void exit() {
        System.out.println("du er logget ut");
        System.exit(1);

    }

}













package Controller;

import java.util.*;
import data.Data;
import model.Members;
import model.User;
import model.Admin;



public class AdminController {
    private Scanner input;
    private Data data;
    private User currentUser;
    MemberController memberController;
    MainController mainController;
    private Members members;
    private Admin admin;


    public AdminController( User currentUser) {
        this.input = input;
        this.currentUser = currentUser;
    }

    /*public void CreateUser() { //hele methoden er useless. Allerede i MAINControllaaah

        String username;
        String Kode, repeatkode;
        System.out.println("Indtast brugernavn");
        username = input.next();

        do {
            System.out.println("Indtast kode");
            Kode = input.next();
            System.out.println("Indtast kode igen ");
            repeatkode = input.next();
            if (Kode != repeatkode) {
                System.out.println("Koderne matchede ikke, prøv igen.");
            }
        } while (Kode != repeatkode);
        // data.getUsers().add(new Members()); //Vi bruger en boolean til at den ikke opretter en admin konto
        System.out.println("Din bruger er nu oprettet\nLog ind på din profil ved at vælge (Log in)");
    } */



    public void printAllUsers() {
        System.out.println("Samtlige medlemmer i systemet");

        int i = 1;
        System.out.println("I alt er der" + " " + data.getUsers().size() + " " + "medlemmer registreret i systemet");
        for (User user : data.getUsers()) {
            System.out.println(i++ + ") " + data.getUsers());
        } //Virker ikke. Nullpointer
    }



    public void PrintSpecType() {

        System.out.println("Samtlige me");

        System.out.printf("%-20s %-20s\n", "Brugernavn: ", "kode: ");
        System.out.printf("%-20s %-20s\n", currentUser.getUsername(), currentUser.getKode());
    }



    public void setCurrentUser(User user) {
        this.currentUser = user;
    }




    public void printAdminMenu() {
        do {
            System.out.println("\n Du har nu følgende valgmuligheder: \n");
            System.out.println("1) Ændre i et medlems oplysninger");
            System.out.println("2) Slet et medlem");
            System.out.println("3) Godkend et medlem");
            System.out.println("4) Vis alle oplysninger om et bestemt medlem");
            System.out.println("5) Vis alle oplysninger om alle medlemmer af en bestemt medlemstype");
            System.out.println("6) Vis alle oplysninger om alle medlemmer sorteret efter medlemstype");
            System.out.println("7) Vis en statistik over aldersfordelingen på hver medlemstype");
            System.out.println("😎 Log ud");

            System.out.println("");
            input.nextLine();
            int choice = input.nextInt();
            switch (choice) {
                case 1:

                  memberController.changeMedlem(); //changeMembership må tilføyes i BOC
                    break;
                case 2:
                   memberController.deleteMedlem();// MemberController.deleteMember(); //deleteConcert må tilføyes i BOC
                    break;
                case 3:
                    mainController.addNewMember(); //addNewMember må tilføyes i BOC
                    break;
                case 4:
                    memberController.printMedlem();//Print må dannes i BOC
                    break;
                case 5:
                    printSpecUser();//Print info om alle medlemmer av en bestemt medlemstype
                    break;
                case 6:
                    printSortType(); //Print all info alle medlemmer sortert etter medlemstype
                    break;
                case 7:
                    printSpecAge(); //Vis statistikk over aldersfordelingen per medlemstype
                case 8:
                    currentUser = null; //logout();

                    System.out.println("Tak for idag!");
                    break;
                default:
                    System.out.println("Du skal vælge et tal imellem 1-7");
                    break;
            }

        } while (currentUser != null);
    }



    private void deleteMember() {
        //Scanner input = new Scanner(System.in);

        if (!currentUser.getUser().isEmpty()) {
            System.out.println("Indtast navnet på det medlem som skal slettes:");
            int userNo = input.nextInt();
            User userToDelete = currentUser.getUser().get(--userNo);
            currentUser.getUser().remove(userToDelete);
            System.out.println("Medlem '" + userToDelete.getUser() + "'Er nu slettet fra din medlemsdatabase. Vender tilbage til hovedmenuen... ");
        }
    }



    private void listOfMedlemmer() {
        if (currentUser.getUser().isEmpty()) {
            System.out.println("Ingen medlemmer i din database..");
        } else {
            int i = 1;

            //System.out.printf("%-10s %-40s %-30s %-20s\n", "Navn", "Email:", "Fødseldag:", "Kode:");
            //for (currentUser.getUser(); {
            //        System.out.printf("%-10d %-40s %-30s %-20.2f\n", i, data.getMedlemmer());}{//erstatter User.getName, User.getEmail(), User.getFødselsdag(), brugeroplysninger.getTelefonnummer(), brugeroplysninger.getMedlemstype());
            //    i++;
            //}

        }
    }



   public void printSpecUser(){

   }

   public void printSortType(){
       // ArrayList<User> sortType  = new ArrayList<>();
       // java.util.Collections.sort();


   }

   public void printSpecAge(){
    }
}
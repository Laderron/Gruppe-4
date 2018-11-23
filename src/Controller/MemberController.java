package Controller;

import model.User;
import java.util.Scanner;
import model.Members;
import data.Data;


public class MemberController {
    private Data data = new Data();
    private Scanner input = new Scanner(System.in);
    private User currentUser;
    private MainController mainController;
    private Members members;


    public MemberController(User currentperson) {
        this.currentUser = currentperson;
    }

    //TODO
    public void printMemberMenu() {
        do {
            System.out.println("\n Du har nu følgende valgmuligheder: \n");
            System.out.println("1) Vis all informasjon om dig");
            System.out.println("2) Slet et medlem");
            System.out.println("3) Ændre i et medlems oplysninger");
            System.out.println("4)  Log Ud");

            System.out.println("");
            // input.nextLine();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    printMedlem();//Print må dannes i BOC
                    break;
                case 2:
                    deleteMedlem();// MemberController.deleteMember(); //deleteConcert må tilføyes i BOC
                    break;
                case 3:
                    changeMedlem();// MemberController.deleteMember(); //deleteConcert må tilføyes i BOC
                    break;
                case 4:
                    currentUser = null; //logout();
                    System.out.println("Tak for idag!" + currentUser);
                    break;
                default:
                    System.out.println("Du skal vælge et tal imellem 1-7");
                    break;
            }
        } while (currentUser != null);
    }


    public void deleteMedlem() {
        printMedlem();
        System.out.println("Tast inn nr på medlemmet du ønsker å fjerne");
        int removeMedlem = input.nextInt();
        data.getUsers().remove(removeMedlem - 1);
    }


    public void printMedlem() { //kun access for admin

     /*   int i = 1;
        {
            System.out.printf("%-10s %-20s %-20s %-20s %-10s\n", "nr", "navn", "email", "telefonnummer", "bday", "medlemskab");
            for (User medlem : data.getUsers()) {
                System.out.printf("%-10d %-20s %-20s %-20s %-30s\n", i, medlem.getUser());//, medlem.getEmail(),
                //  medlem.getTelefonnummer(),medlem.getFødselsdag());
                i++;
            }
        }*/
        do {
            System.out.println("vennligst skriv inn din/brukerens email");
            String email = input.next();

            if (email.equals(members.getEmail())) {
                System.out.println(data.getUsers());

            } else {
                System.out.println("No email found");
            }
        } while (currentUser == null);
    }

        public void changeMedlem() {
            System.out.println("☛ Vælg den aktivitet du ønsker at ændre ☚:");
            printMedlem();

            do {
                System.out.println("Hvad ønsker du at ændre:");
                System.out.println("1) Navn");
                System.out.println("2) Email");
                System.out.println("3) Telefonnummer");
                System.out.println("4) Fødselsdato");
                System.out.println("5) Medlemstype");

                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Indtast det nye navnet ");
                        input.nextLine();
                        // data.setUsers().get(i - 1).setNavn(input.nextLine());
                        System.out.println("Navnet er ændret!");
                        break;
                    case 2:
                        System.out.println("Indtast den nye email");
                        input.nextLine();
                        // data.getUsers().get(i - 1).set(input.nextLine());
                        System.out.println("Emailen er endret");
                        break;
                    case 3:
                        System.out.println("Indtast det nye telefonnummer");
                        input.nextLine();
                        //data.getUsers().get(i - 1).setTelefonnummer(input.nextInt());
                        System.out.println("Telefonnummeret er ændret!");
                        break;
                    case 4:
                        System.out.println("Indtast den nye fødselsdato: ");
                        // data.getUsers().get(i - 1).setFødselsdag(input.next());
                        System.out.println("Fødselsdato er ændret!");
                        break;
                    case 5:
                        System.out.println("Inntast medlemstype");
                        //  data.getUsers().get(i - 1).setMedlemstype(input.nextLine());
                        System.out.println("fødselsdato er endret");
                    default:
                        System.out.println("Du skal vælge et tal imellem 1-4");
                }
            } while (currentUser != null);
        }
    }


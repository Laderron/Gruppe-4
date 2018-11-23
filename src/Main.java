import Controller.MainController;

public class Main {

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.run();
    }

}





//Update:
//Har laget en admin klasse der arver fra User.
//Ved innlogging klarer den fortsatt ikke skille mellom admin. Prøver å logge inn som admin men får opp Medlemsmeny.
// Metodene i MemberController er fucked
// Endret metoden printUserType i MainC. Byttet ut instanceof med parametret isAdmin.



package data;

import java.util.ArrayList;

import model.Admin;
import model.Members;
import model.User;


public class Data {

    private ArrayList<User> users;

    public Data() {
        this.users = new ArrayList<User>();

            generateData();
    }

    private void generateData() { //tilknytte brugeropplysninger, til brugere
        User me1 = new Members("BOOM","1234A",false,"Peder Tanberg Hansen","po@gmail.com",12345678, "22/09/2018","Sølv");
        User me2 = new Members("Testbruker", "Test123", false, "Test Mikkelsen", "test@gmail.com", 9876543, "01.01.2019", "gull");

        Members me3 = new Members("DØKFUCK", "1234AB", false,"DØKFORENINGEN", "døk@gmail.com",1234567, "18042018","Sølv");


        User a1 = new Admin("Admin", "1234Admin",true, 1234); //eneste adminbrukeren vår
        Admin a2 = new Admin("Peder","Norge",true,1234);
        //lægger brugereinfo til arraylist

        users.add(me1);
        users.add(me2);
        users.add(me3);


        users.add(a1);
        users.add(a2);


    }

    public ArrayList<User> getUsers(){return users;}  //henter brugere og legger til ny brugerinfo


    public void setUsers(ArrayList<User> users) {this.users = users;}

}





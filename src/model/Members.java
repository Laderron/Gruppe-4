package model;

public class Members extends User {

    private String Navn;
    private String Email;
    private int Telefonnummer;
    private String Fødselsdag;
    private String Medlemstype;


    public Members(String username, String kode, boolean isAdmin, String navn, String email, int telefonnummer, String fødselsdag, String medlemstype) {
        super(username, kode, isAdmin);
        Navn = navn;
        Email = email;
        Telefonnummer = telefonnummer;
        Fødselsdag = fødselsdag;
        Medlemstype = medlemstype;
    }



    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        Telefonnummer = telefonnummer;
    }

    public String getFødselsdag() {
        return Fødselsdag;
    }

    public void setFødselsdag(String fødselsdag) {
        Fødselsdag = fødselsdag;
    }

    public String getMedlemstype() {
        return Medlemstype;
    }

    public void setMedlemstype(String medlemstype) {
        Medlemstype = medlemstype;
    }
}

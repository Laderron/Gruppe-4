package model;

public class Admin extends User {

    private int verificationKODE; //denne var bare så jeg kunne lage constructor ¿¿¿

    public Admin(String username, String kode, boolean isAdmin, int verificationKODE) {
        super(username, kode, isAdmin);
       this.verificationKODE = verificationKODE;
    }

    public int getVerificationKODE() {
        return verificationKODE;
    }

    public void setVerificationKODE(int verificationKODE) {
        this.verificationKODE = verificationKODE;
    }
}




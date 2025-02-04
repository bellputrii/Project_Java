import java.util.Date;

public class Owner {
    private int nik;
    private String name;
    private Date dateOfBirth;

    public Owner(int nik, String name, Date dateOfBirth) {
        this.nik = nik;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}

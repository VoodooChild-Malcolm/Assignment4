public class Passenger {
    private int idNumber;
    private String gender;
    private String firstName;
    private String lastName;
    private int contactNumber;

    public Passenger() {}
    public Passenger(int id, String gen, String fN, String lN, int cN) {
        this.idNumber = id;
        this.gender = gen;
        this.firstName = fN;
        this.lastName = lN;
        this.contactNumber = cN;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getContactNumber() {
        return contactNumber;
    }
}

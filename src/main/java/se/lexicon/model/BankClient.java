package se.lexicon.model;

public class BankClient {

    //fields
    private final String socialSecurityNumber;
    private String fullName;
    private String email;
    private String phoneNumber;

    //Constructors creating/instantiating as object
    BankClient(String socialSecurityNumber, String fullName, String email, String phoneNumber){
        this.socialSecurityNumber = socialSecurityNumber;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankClient(String socialSecurityNumber, String fullName) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.fullName = fullName;
    }


    //Methods - verbs/behavior

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        return "BankClient{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

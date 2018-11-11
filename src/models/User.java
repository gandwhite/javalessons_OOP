package models;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean notifyByEmail;
    private boolean notifyBySms;
    private boolean notifyByPhone;
    private boolean notifyByPost;
    private int loyaltyPoints;

    public User(String firstName, String lastName, String email, String phoneNumber, String address, boolean notifyByEmail, boolean notifyBySms, boolean notifyByPhone, boolean notifyByPost){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.setAddress(address);
        this.setNotifyByEmail(notifyByEmail);
        this.setNotifyBySms(notifyBySms);
        this.setNotifyByPhone(notifyByPhone);
        this.setNotifyByPost(notifyByPost);

        this.setLoyaltyPoints(calculateLoyaltyPoints(isNotifyByEmail(),isNotifyByPhone(),isNotifyByPost(),isNotifyBySms()));
    }

    @Override
    public String toString()
    {
        return "FirtsName: " + this.getLastName() +
                "\nLastName: " + this.getFirstName() +
                "\nEmail: " + this.getEmail() +
                "\nLoyaltyPoints: " + this.getLoyaltyPoints();
    }

    private int calculateLoyaltyPoints(boolean... params){
        int result = 0;
        for (boolean i:params){
            if(i)
                result += 40;
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public boolean isNotifyByEmail() {
        return notifyByEmail;
    }

    public boolean isNotifyBySms() {
        return notifyBySms;
    }

    public boolean isNotifyByPhone() {
        return notifyByPhone;
    }

    public boolean isNotifyByPost() {
        return notifyByPost;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNotifyByEmail(boolean notifyByEmail) {
        this.notifyByEmail = notifyByEmail;
    }

    public void setNotifyBySms(boolean notifyBySms) {
        this.notifyBySms = notifyBySms;
    }

    public void setNotifyByPhone(boolean notifyByPhone) {
        this.notifyByPhone = notifyByPhone;
    }

    public void setNotifyByPost(boolean notifyByPost) {
        this.notifyByPost = notifyByPost;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}

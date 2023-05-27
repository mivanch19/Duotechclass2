public class Email {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private double capacity;
    private double maxAttachmentSize;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getMaxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setMaxAttachmentSize(double maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }
}

public class Patient extends User{
/*
    int id;
    private String name;
    private String email;
    private String adresss;
    private String phoneNumber;

 */
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email, String phonenumber, String address, String birthday, double weight, double height, String blood){
        super(name, email, phonenumber, address);
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.blood = blood;
    }

    //metodos get y set para enviar datos y recivir

    public String getBirthday() {
        return birthday;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

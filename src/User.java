public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phonenumber;

    //constructor
    public User(String name, String email, String address, String phonenumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        if(phonenumber.length() > 8){
            System.out.println("el numero debe de ser de 8 digitos");
        }else if(phonenumber.length() == 8){
            this.phonenumber = phonenumber;
        }
        return phonenumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    //sobre escribir metodos
    @Override
    public String toString() {
        return super.toString();
    }
}

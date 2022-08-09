import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //se declaran los atributos
/*  static int id = 0; //-> para llevar le dato en autoincremento
    String name;
    String speciality;
    String email;
*/
    //atributos
    private String speciality;

    Doctor(String name, String email, String address, String phonenumber, String speciality){
        super(name, email, address, phonenumber);
        //System.out.println("Nombre: "+name);
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

/*
    Doctor(){
        System.out.println("construyendo un nuevo doctor ID: " + id++);
    }
*/
    //comportamientos -> le damos salida en la terminal al objeto doctor
    /*
        public void showName(){
            System.out.println(name);
        }
        public void showId(){
            System.out.println("ID Doctor: "+ Doctor.id);
        }
    */

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void AddAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    //se crea la clase para tener la hora
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}

//me importa la interfaz del menu en java
import static ui.UIMenu.*;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;

//esta es mi clase de punto de entrada
public class Main {
    public static void main(String[] args) {

        //showMenu();
        //mostrar al doctor
        Doctor myDoctor = new Doctor("Daniel", "daniel@correo.com", "medellin", "1234", "Fotografia");

        myDoctor.AddAvailableAppointment(new Date(), "4pm");
        myDoctor.AddAvailableAppointment(new Date(), "5pm");
        myDoctor.AddAvailableAppointment(new Date(), "6pm");
        myDoctor.AddAvailableAppointment(new Date(), "7pm");

        System.out.println(myDoctor.getAvailableAppointments());
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor.getSpeciality());
        System.out.println(myDoctor.getAddress());
        System.out.println(myDoctor.getEmail());
        System.out.println(myDoctor.getPhonenumber());


        for (Doctor.AvailableAppointment availableAppointment:myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient myPatien = new Patient(
                "Carlos",
                "carlos@correo.com",
                "12345678",
                "medellin",
                "5 de fecbero",
                8.4,1.7,"0 RH +");
        System.out.println(myPatien.getName());

    }
}


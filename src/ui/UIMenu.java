package ui;

import javax.swing.*;
import java.util.Scanner;
public class UIMenu {

    //opciones del menu de manera grafica
    public static int respuesta = 0;
    //opciones del menu de manera grafica

    public static Scanner input = new Scanner(System.in);
    public static String[] monthsAno = {
            "Enero",
            "Febrero",
            "Arzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
    };
    public static String[] meses = {};
    public static void showMenu(){

        do{
            /*
                System.out.println("Ingresa una opcion para solicitar cita medica");
                System.out.println("-----------------------------");
                System.out.println("1. Doctor");
                System.out.println("2. Patient");
                System.out.println("0. Exit");
                System.out.println("-----------------------------");
            */
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(
                    "* Solicitar cita medica * \n" +
                    "********************* \n" +
                    "1. Ver el horario del Doctor  \n" +
                    "2. Informacion del Paciente \n" +
                    "0  Salir \n"));

            //ingresan opciones de la cita medica
            //respuesta = input.nextInt();
            //respuesta = Integer.parseInt(JOptionPane.showInputDialog(""));

            switch (respuesta){
                case 1:
                    showDoctorMenu();
                    break;
                case 2:
                    showPatientMenu();
                    break;
                default:
                    //System.out.println("opcion no valida");
                    //JOptionPane.showInputDialog("Opcion no valida");
            }
        }while(respuesta != 0);
        //System.out.println("salio del programa");
        JOptionPane.showMessageDialog(null, "salio del programa");
    }
    public static void showPatientMenu(){

        do {
            /*
                System.out.println("Menu del paciente");
                System.out.println("-----------------");
                System.out.println("1. Book an appointment");
                System.out.println("2. My appointments");
                System.out.println("0. Exit");
                System.out.println("------------------");
            */
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(
                    "* Menu del paciente * \n" +
                    "********************* \n" +
                    "1. Libro de citas y fechas  \n" +
                    "2. Mis citas medicas \n" +
                    "0  Salir \n"));

            //respuesta = input.nextInt();

            switch (respuesta){
                case 1:
                    Object meses = JOptionPane.showInputDialog(
                            null,
                            "Seleccione un mes",
                            "Meses",
                            JOptionPane.QUESTION_MESSAGE, null,
                            new Object[]{
                                    "Enero",
                                    "Febrero",
                                    "Arzo",
                                    "Abril",
                                    "Mayo",
                                    "Junio",
                                    "Julio",
                                    "Agosto",
                                    "Septiembre",
                                    "Octubre",
                                    "Noviembre",
                                    "Diciembre"
                            }, null);
                    JOptionPane.showMessageDialog(null, "Selecciono el mes: "+meses);
                    /*
                    for (int i = 1; i < 4; i++) {
                        //System.out.println(monthsAno[i]);
                        //JOptionPane.showMessageDialog(null, monthsAno[i]);
                    }*/
                    break;
                case 2:
                    //System.out.println("opcion 2");
                    JOptionPane.showMessageDialog(null, "opcion 2");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    //System.out.println("opcion no valida");
                    JOptionPane.showMessageDialog(null, "opcion 3");
                    break;
            }

        }while(respuesta != 0);
    }

    public static void showDoctorMenu(){
        JOptionPane.showMessageDialog(null, "opciones del menu doctor");
    }
}

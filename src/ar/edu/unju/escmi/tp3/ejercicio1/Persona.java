package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private String provincia;

    public Persona() { }

    public Persona(int dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.provincia = provincia;
    }

    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public int calcularEdad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                "\nNombre: " + nombre +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nDomicilio: " + domicilio +
                "\nProvincia: " + provincia +
                "\nEdad: " + calcularEdad();
    }

    public void mostrarDatos() {
        System.out.println(this.toString());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
        System.out.println("-----------------------------");
    }
}

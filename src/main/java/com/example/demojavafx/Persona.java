package com.example.demojavafx;

import java.util.Objects;

public class Persona {
    String nombre;
    String Apellidos;
    int Edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Edad == persona.Edad && Objects.equals(nombre, persona.nombre) && Objects.equals(Apellidos, persona.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Apellidos);
    }
}

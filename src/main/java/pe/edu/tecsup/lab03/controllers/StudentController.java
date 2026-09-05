package pe.edu.tecsup.lab03.controllers;

import java.util.Objects;

public class StudentController {

    private String controllerId; // Supongamos que tienes un atributo

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si es la misma instancia en memoria
        if (o == null || getClass() != o.getClass()) return false; // Si es nulo o de otra clase
        StudentController that = (StudentController) o;
        return Objects.equals(controllerId, that.controllerId); // Compara el atributo
    }

    @Override
    public int hashCode() {
        return Objects.hash(controllerId); // Siempre implementa hashCode si cambias equals
    }
}

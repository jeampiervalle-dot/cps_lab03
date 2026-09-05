package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private Long id;
    private String name;
    private String email;

    // Método toString básico corregido (Retorna String, NO float)
    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

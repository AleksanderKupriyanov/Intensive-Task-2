package Task2.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Integer age;
    private String created_at;

    public User(String name, String email, Integer age, String created_at) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.created_at = created_at;
    }

    public User() {

    }
}
package online.joanmarin.paginationexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    Integer id;
    @Column(name="NAME")
    String name;
    @Column(name="LASTNAME")
    String lastName;
    @Column(name="AGE")
    Integer age;
}

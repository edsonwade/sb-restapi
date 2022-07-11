package traineer.vanilson.restfullapis_with_spring_boot_2022.persistence.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

<<<<<<< HEAD
    private long id;
=======
    private Integer id;
>>>>>>> 92c3238013c9fc6d6f3c2bc56e4530c892af95df
    private String firstName;
    private String lastName;
    private String address;
    private Gender gender;

    public Person(String firstName, String lastName, String address, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }
}

package kodlama.io.HRMS.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="users1")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobSeekers", "hibernateLazyInitializer", "handler", "systemEmployees", "hibernateLazyInitializer", "handler", "employers"})

public class User {
    @Id
    @GeneratedValue

    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "user1")
    private List<Job_Seeker> jobSeekers;

    @OneToMany(mappedBy = "user2")
    private List<System_Employee> systemEmployees;

    @OneToMany(mappedBy = "user3")
    private List<Employer> employers;

}

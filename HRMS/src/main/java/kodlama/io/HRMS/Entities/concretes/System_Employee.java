package kodlama.io.HRMS.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="system_employee")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerConfrimes"})
public class System_Employee {
    @Id
    @GeneratedValue
    @Column(name="system_employee_id")
    private int systemEmployeeId;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user2;

    @OneToMany(mappedBy = "systemEmployee")
    private List<Employer_Confrimes> employerConfrimes;

}

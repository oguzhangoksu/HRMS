package kodlama.io.HRMS.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="employer")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerVerifications","hibernateLazyInitializer", "handler","employerConfrimes"})

public class Employer {
    @Id
    @GeneratedValue
    @Column(name="employer_id")
    private int employerId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="web_site")
    private String webSite;

    @Column(name="phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user3;


    @OneToMany(mappedBy = "employer1")
    private List<Employer_Verification> employerVerifications;

    @OneToMany(mappedBy = "employer2")
    private List<Employer_Confrimes> employerConfrimes;
}

package kodlama.io.HRMS.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="employer_confrimes")
@AllArgsConstructor
@NoArgsConstructor
public class Employer_Confrimes {

    @Id
    @GeneratedValue
    @Column(name="employer_confrimes_id")
    private int employerConfrimesId;

    @Column(name = "is_confirmed")
    private boolean isConfrimed;

    @Column(name="date")
    private Date date;

    @ManyToOne
    @JoinColumn(name="system_employee_id")
    private System_Employee systemEmployee;

    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer2;



}

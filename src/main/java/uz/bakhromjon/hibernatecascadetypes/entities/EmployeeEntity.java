package uz.bakhromjon.hibernatecascadetypes.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable {
    private static final long serialVersionUID = -1798070786993154676L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    private Integer employeeId;
    @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
    private String firstName;
    @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
    @JoinColumn(name = "EMPLOYEE_ID")
    private Set<AccountEntity> accounts;
}


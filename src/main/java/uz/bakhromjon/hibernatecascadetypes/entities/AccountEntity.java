package uz.bakhromjon.hibernatecascadetypes.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Account")
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer accountId;
    @Column(name = "ACC_NO", unique = false, nullable = false, length = 100)
    private String accountNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private EmployeeEntity employee;
}

package uz.bakhromjon.hibernatecascadetypes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "UPDATE problem SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String definition;

    @ManyToOne(fetch = FetchType.LAZY)
    private Appeal appeal;

    private Boolean deleted = Boolean.FALSE;

    public Problem(String definition, Appeal appeal) {
        this.definition = definition;
        this.appeal = appeal;
    }
}


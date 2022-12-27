package uz.bakhromjon.hibernatecascadetypes.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@SQLDelete(sql = "UPDATE appeal SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Appeal {
    @Id
    private Integer id;
    private String definition;
    @OneToMany(mappedBy = "appeal", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Problem> problems;

    private Boolean deleted = Boolean.FALSE;

    public Appeal(Integer id, String definition) {
        this.id = id;
        this.definition = definition;
    }
}

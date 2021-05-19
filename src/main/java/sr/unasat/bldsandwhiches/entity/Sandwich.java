package sr.unasat.bldsandwhiches.entity;

import javax.persistence.*;

@Entity
public class Sandwich {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn()
    private Topping topping;


}

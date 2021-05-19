package sr.unasat.bldsandwhiches.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meal {
    @Id
    @GeneratedValue
    private Long id;

}

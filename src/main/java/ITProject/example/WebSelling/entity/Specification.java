package ITProject.example.WebSelling.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor()
@AllArgsConstructor()
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "specifications")
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spec_id")
    Long specId;

    @Column(name = "spec_key")
    String specKey;

    @Column(name = "spec_value")
    String specValue;

    @Column(name = "brief_spec_value")
    String briefSpecValue;

}

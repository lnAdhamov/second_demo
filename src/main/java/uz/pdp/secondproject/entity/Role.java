package uz.pdp.secondproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;

    private String name;
}

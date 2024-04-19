package uz.pdp.secondproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private LocalDateTime dateTime;
    private boolean status;
    private boolean delivered;

    @ManyToOne
    private User user;

    public String formatDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dateTime.format(formatter);
    }

    public String checkStatus() {
        if (status) {
            return "Ready To Deliver";
        } else {
            return "New";
        }
    }

    public String checkDeliver() {
        if (delivered) {
            return "Delivered";
        } else {
            return "";
        }
    }
}

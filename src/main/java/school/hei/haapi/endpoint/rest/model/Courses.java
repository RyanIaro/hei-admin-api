package school.hei.haapi.endpoint.rest.model;

import lombok.*;
import org.hibernate.annotations.TypeDef;
import school.hei.haapi.repository.types.PostgresEnumType;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"course\"")
@TypeDef(name = "pgsql_enum", typeClass = PostgresEnumType.class)
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courses implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;

    @NotBlank(message = "Code is mandatory")
    private String code;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Credits name is mandatory")
    private int credits;
    @NotBlank(message = "total-hours name is mandatory")
    private String total_hours;

    @OneToMany
    @JoinColumn(name = "main_teacher_id")
    private User main_teacher;
    @ManyToMany
    @JoinTable(
            name= "linked_or_unliked",
            JoinColumn=@JoinColumn(name = "User_id"),
            inverseJoinColumn=@JoinColumn(name = "course_id")
    )
    private List<User> userStatus;
}
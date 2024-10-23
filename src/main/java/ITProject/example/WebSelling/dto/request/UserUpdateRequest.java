package ITProject.example.WebSelling.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserUpdateRequest {


    String fullName;

    String email;

    String phone;

    LocalDate dob;

    String password;

    Integer state;


}
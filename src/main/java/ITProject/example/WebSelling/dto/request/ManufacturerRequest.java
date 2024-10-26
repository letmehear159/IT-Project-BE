package ITProject.example.WebSelling.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ManufacturerRequest {
    @JsonProperty("name")
    String manufacturerName;

    @JsonProperty("description")
    String manufacturerDescription;


}
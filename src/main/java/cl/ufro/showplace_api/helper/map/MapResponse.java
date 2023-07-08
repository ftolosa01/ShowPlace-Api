package cl.ufro.showplace_api.helper.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MapResponse {
    private String message;
    private double lat;
    private double lng;
}
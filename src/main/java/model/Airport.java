package model;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import javax.annotation.processing.Generated;
public class Airport {
    public Airport()
    {}
    @Id
    long Airport_Id;
    String AirportName;
    String Location;

    public void setAirportName(String airportName) {
        AirportName = airportName;
    }

    public void setLocation(String location) {
        Location = location;
    }
}

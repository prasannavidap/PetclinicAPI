package petclinic.api.owners.data;

import com.google.gson.annotations.Expose;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Visit {

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", pet=" + pet +
                '}';
    }

    @Expose
    private int id;

    @Expose
    private String date;

    @Expose
    private String description;

    @Expose
    private int pet;
}

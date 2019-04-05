import lombok.Builder;
import lombok.Singular;
import java.util.*;

@Builder
public class SampleEmployeeBuilder {

    // to assign a default value
    @Builder.Default private long created = System.currentTimeMillis();
    private String firstName;
    private String lastName;
    private int phoneNo;
    @Singular private Set<String> addresses;

}

package multithreading.lombok;

import lombok.Builder;
import lombok.Data;

/**
 * Created by dmitriyn on 5/24/16.
 */
@Builder
@Data
public class PersonEntity {
    private String name = "Bull";
    private int age = 15;

    public void run() {

    }
}

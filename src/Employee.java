package src;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    long id;
    String name;
    int age;
    float salary;
}

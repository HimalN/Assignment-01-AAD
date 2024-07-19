package lk.ijse.assignment01aad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee implements Serializable {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;
}

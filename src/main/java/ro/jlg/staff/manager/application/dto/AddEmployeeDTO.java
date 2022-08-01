package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddEmployeeDTO {
    private String name;
    private String email;
    private String dateOfBirth;


}

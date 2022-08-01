package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ModifyEmployeeDTO {
    private String id;
    private String email;
    private String dateOfBirth;
}

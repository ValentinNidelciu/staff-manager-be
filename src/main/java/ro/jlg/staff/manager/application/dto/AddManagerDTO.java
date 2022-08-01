package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.List;

@AllArgsConstructor
@Getter
public class AddManagerDTO {
    private String name;
    private String email;
    private String dateOfBirth;
    private String departmentId;
    private List<String> subordinatedEmployeeIds;
}

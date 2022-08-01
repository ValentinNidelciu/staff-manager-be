package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class UpdateManagerDTO {
    private String name;
    private String dateOfBirth;
    private String departmentId;
    private List<String> subordinatedEmployeeIds;
}

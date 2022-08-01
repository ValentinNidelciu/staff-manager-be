package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddDepartmentDTO {
    private String name;
    private String description;
    private int maxEmployees;
}

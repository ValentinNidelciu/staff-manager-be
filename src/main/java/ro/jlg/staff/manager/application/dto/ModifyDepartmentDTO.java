package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ModifyDepartmentDTO {
    private String id;
    private String name;
    private String description;
    private int maxEmployees;

}

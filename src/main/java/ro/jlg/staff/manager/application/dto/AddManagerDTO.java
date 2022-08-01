package ro.jlg.staff.manager.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
public class AddManagerDTO {
    private String name;
    private String email;
    private LocalDateTime dateOfBirth;
    private String departmentId;
    private List<String> subordinatedEmployeeIds;
}

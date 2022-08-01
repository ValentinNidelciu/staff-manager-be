package ro.jlg.staff.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ro.jlg.staff.manager.application.dto.UpdateManagerDTO;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Document
public class Manager {
    @Id
    private String id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private String departmentId;
    private List<String> subordinatedEmployeeIds;

    public void update(final UpdateManagerDTO updateManagerDTO){
        this.name = updateManagerDTO.getName();
        this.dateOfBirth = LocalDate.parse(updateManagerDTO.getDateOfBirth());
        this.departmentId = updateManagerDTO.getDepartmentId();
        this.subordinatedEmployeeIds = updateManagerDTO.getSubordinatedEmployeeIds();
    }

}

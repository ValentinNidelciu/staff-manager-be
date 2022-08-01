package ro.jlg.staff.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Document
public class Manager {
    @Id
    private String id;
    private String name;
    private String email;
    private LocalDateTime dateOfBirth;
    private String departmentId;
    private List<String> subordinatedEmployeeIds;

}

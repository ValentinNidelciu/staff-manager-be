package ro.jlg.staff.manager.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@Getter
public class Department {

    @Id
    private String id;
    private String name;
    private String description;
    private int maxEmployees;

    // Constructor
    public Department(final String id, final String name,
                      final String description, final int maxEmployees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }

    public void modifyDepartment(final String name, final String description, final int maxEmployees) {
        this.name = name;
        this.description = description;
        this.maxEmployees = maxEmployees;
    }

}

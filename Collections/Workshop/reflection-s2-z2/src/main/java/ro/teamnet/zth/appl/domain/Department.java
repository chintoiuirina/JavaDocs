package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotation.Column;
import ro.teamnet.zth.api.annotation.Id;
import ro.teamnet.zth.api.annotation.Table;

/**
 * Created by Irina on 28.04.2015.
 */
@Table(name="departments")
public class Department {

    @Id(name = "DEPARTMENT_ID")
    private Long id;

    @Column(name="DEPARTMENT_NAME")
    private String departmentName;

    @Column(name="LOCATION_ID")
    private Location location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        return !(location != null ? !location.equals(that.location) : that.location != null);

    }


}

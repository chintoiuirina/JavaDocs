package ro.teamnet.zth.api.em;

/**
 * Created by Irina on 28.04.2015.
 */
public class Condition {

    private String columnName;
    private Object value;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

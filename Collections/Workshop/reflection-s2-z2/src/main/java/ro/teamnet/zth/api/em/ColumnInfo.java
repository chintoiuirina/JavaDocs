package ro.teamnet.zth.api.em;

/**
 * Created by Irina on 28.04.2015.
 */
public class ColumnInfo {

    private String columnName;
    private Class columnType;
    private String dbName;
    private boolean isId;
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

    public boolean isId() {
        return isId;
    }

    public void setIsId(boolean isId) {
        this.isId = isId;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Class getColumnType() {
        return columnType;
    }

    public void setColumnType(Class columnType) {
        this.columnType = columnType;
    }
}




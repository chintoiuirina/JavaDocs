package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotation.Column;
import ro.teamnet.zth.api.annotation.Id;
import ro.teamnet.zth.api.annotation.Table;

import javax.swing.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irina on 28.04.2015.
 */
public class EntityUtils {

    private EntityUtils() {
        throw new UnsupportedOperationException();
    }

    public static String getTableName(Class entity) {

        Table annotation = (Table) entity.getAnnotation(Table.class);

        return annotation.name();
    }

    public static List<ColumnInfo> getColumns(Class entity) {

        List<ColumnInfo> l = new ArrayList<ColumnInfo>();


        for (Field a : entity.getDeclaredFields()) {
            Column annotation = a.getAnnotation(Column.class);
            if (annotation != null) {
                ColumnInfo b = new ColumnInfo();
                b.setColumnName(a.getName());
                b.setColumnType(a.getType());
                b.setDbName(annotation.name());
                l.add(b);

            }
            Id annotation2 = a.getAnnotation(Id.class);
            if (annotation2 != null) {
                ColumnInfo c = new ColumnInfo();
                c.setIsId(true);
                c.setDbName(annotation2.name());
                c.setColumnType(a.getType());
                c.setColumnName(a.getName());
                l.add(c);
            }
        }

        return l;


    }

    public static Object castFromSqlType(Object value, Class wantedType) {
        if (value instanceof java.math.BigDecimal && wantedType == Integer.class) {
            java.math.BigDecimal a = (java.math.BigDecimal) value;
            return a.intValue();

        } else
            return value;


    }

    public static List<Field> getFieldsByAnnotations(Class clazz, Class annotation) {
        List<Field> fields = new ArrayList<Field>();
        for (Field a : clazz.getDeclaredFields()) {

            if (a.getAnnotation(annotation)!=null)
                fields.add(a);

        }
        return fields;

    }




}




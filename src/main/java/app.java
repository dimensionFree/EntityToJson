import com.alibaba.fastjson.JSONObject;

import entity.entity.YsykzxjhMx;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class app {
    public static void main(String[] args) throws IllegalAccessException {
        //创建user对象
//        Project project = new Project();
//        ProjectJxzb project = new ProjectJxzb();
        YsykzxjhMx project = new YsykzxjhMx();

        Field[] field = project.getClass().getDeclaredFields();
        System.out.print("field:");
        Class<Number> numberClass = Number.class;
        for (Field field1 : field) {
            System.out.println(field1);
            System.out.println(numberClass.isAssignableFrom(field1.getType()));
            if (field1.getType().getName()==String.class.getName()){
                field1.set(project,"test");
            }
            if (numberClass.isAssignableFrom(field1.getType())){
                if (field1.getType().getName()==BigDecimal.class.getName()){
                    field1.set(project,new BigDecimal(0));
                }
                else {
                    field1.set(project,0);
                }
            }
            if (field1.getType().getName()==Date.class.getName()){
                field1.set(project,new Date());
            }

        }

        System.out.println();
//        System.out.println(project);
        //转化成json对象
        Object json = JSONObject.toJSON(project);
        //输出
        System.out.println(project.getClass());
        System.out.println(json);
    }
}

package testlv1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException {
        String path = "testlv1.User";
        Class<User> clazz = null;
        Field [] fields = clazz.getDeclaredFields();
        for(Field temp:fields){
            System.out.println(temp);

        }
        Method[] methods = clazz.getDeclaredMethods();
        Method mo = clazz.getDeclaredMethod("getName",null);
    }










}


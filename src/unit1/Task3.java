package unit1;

import java.lang.reflect.Field;
import java.util.Date;


public class Task3 {
    private int x = 5;
    private String  asd = "sdfs";
    private int[] z = new int[]{1,2,3};



    public static String toString(Object object) throws IllegalAccessException {

        Class classOfObject = object.getClass();

        String resault = classOfObject.getName() + " ";

        Field fields [] = classOfObject.getDeclaredFields();

        for(Field f: fields){

            f.setAccessible(true);

            Class typeOfField = f.getType();

            if((typeOfField.isPrimitive())|| (typeOfField == String.class)|| typeOfField.isArray())
               resault +=  "{ " + f.getName()+ " = " + f.get(object) + " }";
            else
                toString(f.get(object));
            }


        return resault;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Task3 task3 = new Task3();
        System.out.println(toString(task3));
    }
}

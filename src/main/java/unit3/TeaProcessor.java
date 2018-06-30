package unit3;

import java.lang.reflect.Field;

public class TeaProcessor {
    public static Object process(Object object) throws IllegalAccessException {

        Class classOfObject = object.getClass();

        Field fields[] = classOfObject.getDeclaredFields();

        for(Field field: fields){
            field.setAccessible(true);

            Object fieldValue = field.get(object);

            if(fieldValue != null)
                return object;

            Default annotation = field.getAnnotation(Default.class);

            if(annotation != null){
                Class fieldType = field.getType();
                if(fieldType == String.class){

                }
                else if(fieldType == int.class){

                }
                else if(fieldType == double.class){

                }
            }
        }
        return object;
    }
}

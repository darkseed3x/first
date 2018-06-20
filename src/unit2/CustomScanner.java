package unit2;



import unit2.ex.Example1;
import unit2.ex.Example2;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;


public class CustomScanner {
    public void Scanning() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        ArrayList<Object> list = new ArrayList<>();

        File folder = new File(".\\src\\unit2\\ex");
        String[] listNames = folder.list();

        for (int i = 0; i < listNames.length; i++) {

            listNames[i] = "unit2.ex." + listNames[i].substring(0, listNames[i].length() - 5);
            Class clazz = Class.forName(listNames[i]);
            Field fields[] = clazz.getDeclaredFields();


            if ("unit2.ex.Example1".equals(listNames[i])) {
                Example1 example1 = (Example1) clazz.newInstance();
                modifyfields(example1, fields);
                list.add(example1);

            } else {
                Example2 example2 = (Example2) clazz.newInstance();
                modifyfields(example2, fields);
                list.add(example2);
            }

        }
        for (Object object : list) {
            System.out.println(object);
        }

    }

    private Object modifyfields(Object object, Field fields[]) throws IllegalAccessException {
        for (Field field : fields) {

            RandomInt annotation = field.getAnnotation(RandomInt.class);
            if (annotation != null) {
                Random random = new Random();
                int number = annotation.min() + random.nextInt(annotation.max() - annotation.min());

                field.setAccessible(true);
                field.set(object, number);
            }
        }
        return object;
    }
}


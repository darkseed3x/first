package unit1;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ArrayList<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(".\\src\\main\\resources\\1"))){

            while (reader.ready()){

                String str =reader.readLine().trim();

                if(str.equals(""))
                    continue;

                String [] strings = str.split("\\s");

                Person person =new Person();

                Class classPerson = person.getClass();
                Person person1 = (Person) classPerson.newInstance();

                Field fields[] = classPerson.getDeclaredFields();

                for (int i = 0; i <fields.length ; i++) {
                    fields[i].setAccessible(true);
                    fields[i].set(person1,strings[i]);
                }

                persons.add(person1);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Person p : persons)
            System.out.println(p);
    }
}

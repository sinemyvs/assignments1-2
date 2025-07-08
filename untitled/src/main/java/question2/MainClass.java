package question2;

import java.lang.annotation.Annotation;

public class MainClass {


    public static void main(String[] args) {
        Menu.Pizza p= new Menu.Pizza();
        Class<?> x= Food.class;
        System.out.println(x.isAnnotation());

    }
}

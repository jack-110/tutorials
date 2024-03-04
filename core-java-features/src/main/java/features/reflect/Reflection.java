package features.reflect;

import java.lang.reflect.Constructor;

public class Reflection {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("features.reflect.Reflection$User");
            Constructor<?> constructor = clazz.getConstructor(int.class);
            User user = (User)constructor.newInstance(12);
            System.out.println("age: " + user.getAge());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class User {
        private int age;
        private String name;

        public User() {
        }

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }
}

package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName(){
            return "Cat";
        }

        public Pet getChild(){
            Pet p = new Cat();
            return p;
        }
    }

    public static class Dog extends Pet{
        public String getName(){
            return "Dog";
        }

        public Pet getChild(){
            Pet p = new Dog();
            return p;
        }
    }

}

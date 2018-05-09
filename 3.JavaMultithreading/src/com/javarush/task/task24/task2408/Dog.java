package com.javarush.task.task24.task2408;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
В работе вам иногда будет нужно закастить класс к какому-нибудь другому классу, не интерфейсу :)))
Класс DogPet использует 2 класса - SuperDog и Dog, разберись с getName в классе DogPet
Так намного лучше, чем Copy+Paste!
 */
public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**

     * Итак, разбираемся с п.3:
     * Внутри метода toSayable создайте class DogPet, который наследуется от SuperDog и реализует интерфейс Sayable
     * создайте метод private String getName(), который будет использовать логику двух классов - Dog и SuperDog.
     * Пусть этот метод возвращает имя собаки (класс Dog), которое с обеих сторон выделено getSuperQuotes (класс SuperDog)
     * Пример, " *** Барбос *** "
     * Логика метода say:
     * Если i < 1, то используя метод getName вывести на экран, что собака спит. Пример, " *** Шарик ***  спит."'
     * Иначе вывести фразу: "имя_собаки лает гааав! сегодняшняя_дата". Пример для i=3, " *** Тузик ***  лает гааав! 13-ноя-2013 Ср"
     * Для форматирования даты используйте formatter из класса SuperDog.
     * <p/>
     * <b>Пример вывода:</b>
     *  *** Барбос ***  лает гааааав! 13-ноя-2013 Ср
     *  *** Тузик ***  лает гаав! 13-ноя-2013 Ср
     *  *** Бобик ***  лает гааав! 13-ноя-2013 Ср
     * Мыша пищит.
     *  *** Шарик ***  спит.
     *
     * @param i количество букв 'а' в слове гав
     * @return экземпляр класса DogPet
     */
    public Sayable toSayable(final int i) {
       class DogPet extends SuperDog implements Sayable{
           @Override
           public String say() {
               if (i<1){ return getSuperQuotes() + name + getSuperQuotes() + " спит."; }
               else {
                   StringBuilder sb = new StringBuilder(" лает г");
                   for (int j=0; j<i; j++){
                       sb.append("а");
                   }
                   sb.append("в! ");
                   Date date = new Date();
                   return getSuperQuotes() + name + getSuperQuotes() + sb + formatter.format(date);
               }
           }
       }
        return new DogPet();
   }
}
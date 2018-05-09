package com.javarush.task.task17.task1706;

public class OurPresident {
    private volatile static OurPresident president;
    static {
        if (president == null) {
            synchronized (OurPresident.class) {
                if (president == null) {
                    president = new OurPresident();
                }
            }

        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }

}

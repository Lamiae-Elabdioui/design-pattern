package com.your_name.app;


public class Singleton 
{
    private Singleton () {}

    private static int i = 0;
    private static Singleton instance = null;

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
            i=i+1;
            System.err.println(i);
        }
        return instance;
    }

}

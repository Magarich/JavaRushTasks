package com.javarush.task.task15.task1522;

public class Moon implements Planet {
    private Moon() {}
    private static Moon instance = null;
    public static Moon getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Moon();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}

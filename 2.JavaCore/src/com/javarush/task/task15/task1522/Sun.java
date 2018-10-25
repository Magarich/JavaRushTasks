package com.javarush.task.task15.task1522;

public class Sun implements Planet {
    private Sun() {}
    private static Sun instance = null;
    public static Sun getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Sun();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}

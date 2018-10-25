package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private Earth() {}
    private static Earth instance = null;
    public static Earth getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Earth();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}

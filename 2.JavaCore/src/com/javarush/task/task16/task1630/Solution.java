package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }catch (IOException e){}

        }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
       systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
       // f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String outStr = "";
        private File file;
        @Override
        public void setFileName(String fullFileName) {
            //this.fileName = fullFileName;
            this.file = new File(fullFileName);
        }

        @Override
        public String getFileContent() {
            return this.outStr;
        }
        public void run(){
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while(true){
                    String str = reader.readLine();
                    if(str != null)
                        outStr = outStr + str + ' ';
                    else{
                        outStr = outStr.substring(0, outStr.length()-1);
                        reader.close();
                        break;
                    }

                }

            }
            catch (Exception e){}

        }
    }
}

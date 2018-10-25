import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> copyList;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        copyList = new ArrayList<String>(list);

        String tempStr = "";
        int a = 0;
        int temp = 0;

        while (true){
            try {
                tempStr = copyList.get(a);
            }
            catch (Exception e){
                break;
            }

            for (int i = 0; i < list.size() ; i++) {
                if (tempStr.equals(list.get(i)))
                    temp++;
            }

            if(temp > 1){
                for (int i = list.size() - 1; i >= 0; i--) {
                    if(tempStr.equals(list.get(i)))
                        list.remove(i);
                }
                temp = 0;
            }
            a++;
        }
        System.out.println(list);


    }
}

package coplit.iteration;

public class I_04_RepeatString {
    public String repeatString(String str, int num){
        String result = "";

        if(str.isEmpty()){
            return "";
        }else if(num == 0){
            return "";
        }
        for(int i = 0; i < num; i++){
            result = result + str;
        }
        return result;
    }
}

import java.util.Arrays;

public class Driver {
    public static void main(String[] args){
        System.out.println(ascending("232425"));
        System.out.println(ascending("2324256"));
        System.out.println(ascending("444445"));

        squarePatch(3);
        squarePatch(5);
        squarePatch(1);
        squarePatch(0);
    }

    public static boolean ascending(String number){
        boolean status = true;
        for(int i = 0;i<number.length()/2;i++){
            String str = number.substring(0,i+1);
            int num = Integer.valueOf(str);
            int count = i+1;
            int hold = num;
            while(count+i<number.length()){
                String newStr = number.substring(count,count+i+1);
                int newNum = Integer.valueOf(newStr);
                if(newNum!=hold+1){
                    status = false;
                    break;
                }
                else{
                    if(count+i+1==number.length())
                    {
                        return true;
                    }
                }
                hold = newNum;
                count += count;
            }

        }
        return status;
    }

    public static void squarePatch(int number){
        int[] arr = new int[number];
        for(int i = 0;i<arr.length;i++){
            arr[i] = number;
        }
        for(int i = 0;i<arr.length-1;i++){
            System.out.println(Arrays.toString(arr) + ",");
        }
        System.out.println(Arrays.toString(arr));
    }
}

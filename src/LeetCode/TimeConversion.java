package LeetCode;

public class TimeConversion {
    public static void main(String[] arg){
//        String s="07:05:25PM";
        String s="04:59:59AM";
        timeConversion(s);
    }
    public static void timeConversion(String s){
        String time="";
        int h1=s.charAt(1)-'0';
        int h2=s.charAt(0)-'0';
        //get the hours
        int hh=h2*10 +h1%10;
        if(s.charAt(8)=='A'){
            if(hh==12){
                System.out.print("00");
                for(int i=2;i<8;i++){
                    System.out.print(s.charAt(i));
                }
            }
        }else{
            if(hh!=12){
                hh+=12;
                System.out.print(hh);
                for(int i=2; i<8; i++){
                    System.out.print(s.charAt(i));
                }
            }
        }
//        return time;
    }
}
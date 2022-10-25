package home_work_1;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        PhoneNumber.createPhoneNumber(arr);
    }
}

class PhoneNumber{
    public static String createPhoneNumber(int[] a){
        String phoneNum = "";
        System.out.println("PhoneNum = "+"(" + a[0] + a[1] + a[2] + ") "+ a[3]+ a[4]+ a[5]+ "-" + a[6]+ a[7]+ a[8]+ a[9]);
        return phoneNum;
    }

}
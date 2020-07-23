package AssignmentSoftwareTesting;

public class Palendromic implements PalendromicInterface{
    private String str1,str2;
    public boolean checkPalendromic(String str1, String str2) {
        this.str1=str1;
        this.str2=str2;
        StringBuilder sb=new StringBuilder(str1);
        sb.reverse();
        String rev1=sb.toString();
        StringBuilder sb2=new StringBuilder(str2);
        sb2.reverse();
        String rev2=sb2.toString();
        if(str1.equals(rev1) && str2.equals(rev2)){
            return true;
        }else{
            return false;
        }
    }
}

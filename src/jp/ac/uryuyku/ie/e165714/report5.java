package jp.ac.uryuyku.ie.e165714;

/**
 * Created by yonaminehigashi on 2016/12/01.
 */
public class report5 {

    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (java.lang.NullPointerException e){
            System.out.println("java.lang.NullPointerException is emerge");
            e.printStackTrace();
        }

    }
}

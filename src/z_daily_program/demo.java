package z_daily_program;

public class demo {
    public static void main(String[] args) {

        String name="abshikesh";
        String rev = "";

        for (int i=0;i<name.length();i++){
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);

        String surname="Gulhane";

        char [] toChar = surname.toCharArray();
        String rev2="";


        for(int i=surname.length()-1;i>=0;i--){
            rev2 =rev2+toChar[i];
        }
        System.out.println(rev2);



    }
}

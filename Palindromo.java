public class Palindromo {
    public static void main(String[] args) {
        //cambiuo
    }

    public static void esPalindromo(String data){
        int middle = data.length()/2;
        String r = "Yes";

        for(int i=0; i<=middle; i++){
            if(data.charAt(i)!=data.charAt(data.length()-i-1)){
                r = "No";
                break;
            }
        }

        System.out.println(r);
    }
}

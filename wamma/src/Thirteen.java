import java.util.Scanner;

class Thirteen {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int inputNum = keyboard.nextInt();
        keyboard.nextLine();
        for(int i =0 ; i<inputNum; i++){
            String input =keyboard.nextLine();
            String[] arr = input.split(" ");
            int l = arr.length;
            for(int j=0; j<l; j++){
                StringBuffer s = new StringBuffer(arr[j]);
                System.out.printf("%s ",s.reverse());
            }
            System.out.println("");
        }


    }
}




import java.util.Scanner;


        public class Main {

            public static void main(String[] args) {

                System.out.println("Hello World!");
                Scanner in = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String str = in.nextLine();

                char[] charArray = str.toCharArray();


                char a = charArray[0];
                char b = charArray[2];

                // c использованием метода getNumericValue
                // класса Character
                int a1 = Character.getNumericValue(a);
                int b1 = Character.getNumericValue(b);


                char c = charArray[1];


                int i = (int)c;

                if(i == 42){
                    int  sum = a1 * b1;
                    System.out.println(sum);

                }
                if(i == 43){
                    int  sum = a1 + b1;
                    System.out.println(sum);

                }
                if(i == 45){
                    int  sum = a1 - b1;
                    System.out.println(sum);

                }
                if(i == 47){
                    int  sum = a1 / b1;
                    System.out.println(sum);

                }









    }
}

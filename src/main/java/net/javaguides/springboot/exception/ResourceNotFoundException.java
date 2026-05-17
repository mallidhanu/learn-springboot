package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }


//    public static void main(String[] args) {
//        int n = 4 ; // rows
//        for (int i = 1; i <= n; i++) {
//            for (int space = 1; space <= n - i; space++) {
//                System.out.print(" ");
//            }
//            for (int stars = 1; stars <= i * 2 - 1 ; stars++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int n= 4;
//        for (int rows = 1; rows <= n ; rows++) {
//            for (int spaces = 1; spaces <= n-rows ; spaces++) {
//                System.out.print(" ");
//            }
//
//            if (rows == 1) {
//                System.out.println("*");
//            } else if (rows == n) {
//                for (int stars = 1; stars <= 2 * rows -1 ; stars++) {
//                    System.out.print("*");
//                }
//                }else{
//                System.out.print("*");
//                for (int sp = 1; sp <= 2 * rows -3 ; sp++) {
//                    System.out.print(" ");
//                }
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int col = 1; col <=i ; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int col = 1; col <=n-i ; col++) {
//                System.out.print(" ");
//            }
//                for (int rows = 1; rows <=i ; rows++) {
//                    System.out.print("*");
//                }
//
//            System.out.println();
//        }
//    }



//    public static void main(String[] args) {
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int col = 1; col <=i-1 ; col++) {
//                System.out.print(" ");
//            }
//            for (int rows = 1; rows <=n-i +1 ; rows++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int n=4;
//        for (int i = 1; i <=n ; i++) {
//            for (int col = 1; col <=n-i+1 ; col++) {
//                System.out.print("*");
//            }
//            for (int rows = 1; rows <=i-1 ; rows++) {
//                System.out.print("");
//            }
//
//            System.out.println();
//        }
//    }



    public static void main(String[] args) {
        int n = 4;
        int stars = 6;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int col = 1; col <= i - 1; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int rows = 1; rows <= stars; rows++) {
                System.out.print("*");
            }

            System.out.println();

            // update stars for next row
            stars = stars -2;  //
            if (stars < 1) stars = 1;
        }

         // thuis logic also can use will e=work
        // only decrease by 2 if we still need to print another "decreased" row
//        if (i + 1 < n) {
//            stars -= 2;
//        } else if (i + 1 == n) {
//            // next is last row -> ensure next stars will be 1
//            stars = 1;
//        }
    }







}
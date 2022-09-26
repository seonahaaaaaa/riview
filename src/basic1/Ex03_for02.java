package basic1;

public class Ex03_for02 {

	public static void main(String[] args) {

//      A
//      AB
//      ABC
//      ABCD
//      :
//      ABCDEFGHIJKLMNOPQRSTUVW
//      ABCDEFGHIJKLMNOPQRSTUVWX
//      ABCDEFGHIJKLMNOPQRSTUVWXY
//      ABCDEFGHIJKLMNOPQRSTUVWXYZ
	     System.out.println("====1번");
	     
      for(int i = 0; i < 26 ; i++) {
         for (char j = 'A'; j <= 'A'+i ; j++) {
            System.out.print(j + " ");
         }System.out.println();
      }
//      ABCDEFGHIJKLMNOPQRSTUVWXYZ
//      ABCDEFGHIJKLMNOPQRSTUVWXY
//      ABCDEFGHIJKLMNOPQRSTUVWX
//      ABCDEFGHIJKLMNOPQRSTUVW
//      ABCDEFGHIJKLMNOPQRSTUV
//      :
//      ABC
//      AB
//      A
      System.out.println("====2번");
      for(int i = 0; i < 26 ; i++) {
         for (char j = 'A'; j <= 'Z'- i ; j++) {
            System.out.print(j + " ");
         }System.out.println();
      }
      
//      Z
//      ZY
//      ZYX
//      :
//      ZYXWVUTSRQPONMLKJIHGFEDC
//      ZYXWVUTSRQPONMLKJIHGFEDCB
//      ZYXWVUTSRQPONMLKJIHGFEDCBA
      System.out.println("====4번");
      for (int i = 0; i < 26; i++) {
         for (char j = 'Z'; j >= 'Z'-i ; j--) { // Y
            System.out.print(j + " ");
         }
         System.out.println();

      }
      
//      ABCDEFGHIJKLMNOPQRSTUVWXYZ
//      BCDEFGHIJKLMNOPQRSTUVWXYZ
//      CDEFGHIJKLMNOPQRSTUVWXYZ
//      DEFGHIJKLMNOPQRSTUVWXYZ
//      :
//      XYZ
//      YZ
//      Z
      
      for (char i = 'A'; i <= 'Z'; i++) {
         for (char j = i ; j < 'A' + 26; j++) {
            System.out.print(j + " ");
         }
         System.out.println();
      }
      System.out.println("====3번");
      
//      ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        BCDEFGHIJKLMNOPQRSTUVWXYZ
//          CDEFGHIJKLMNOPQRSTUVWXYZ
//            DEFGHIJKLMNOPQRSTUVWXYZ
//             :
//                                              WXYZ
//                                                  XYZ
//                                                    YZ
//                                                      Z
      System.out.println("====5번");
      for(int i = 0; i < 26; i++) {
         for(int j = 0; j <= i; j++) {
         System.out.print(" ");
         }//for
         for(char a = (char) ('A'+i); a <= 'Z'; a++) {
         System.out.print(a);
         }//for
         System.out.println();
         }//for
      
	}

}
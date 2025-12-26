// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package pattern;

import java.util.Scanner;

public class NumberTriangle {
   public NumberTriangle() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 <= var3; ++var4) {
            System.out.print("" + var4 + " ");
         }

         System.out.println();
      }

   }
}

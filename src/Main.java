public class Main {
        public static void main(String[] args) {
         String str = "HelloWorldJava";
         int size = 3;
         for ( int i = 0; i < str.length(); i +=size) {
             int end = Math.min(str.length(),  i +size);
             System.out.println(str.substring(i, end));
         }

        }
    }

public class Example2 {

    public static void main(String[] args) {
        /**
         * We want parse the following code to a lambda expresion
         */
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
            }
        };

        /**
         * Using these steps whe parse the previous code to a lambda expresion:
         *     Step 1: Remove anonymous class declaration and opening braces
         *     Step 2: Remove method name and replaced{ with -> Separator
         *     Step 3: Remove closing braces } for method and anonymous class
         *     Step 4: Remove semicolon after the statement unless it is a method block
         */
        Runnable r2 = () -> System.out.println("Runnable 2");

        r1.run();
        r2.run();
    }
}

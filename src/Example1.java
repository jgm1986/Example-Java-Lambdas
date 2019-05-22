public class Example1 {

    public static void main(String[] args) {
        /**
         * We want parse the following code to a lambda expresion
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        });

        /**
         * Using these steps whe parse the previous code to a lambda expresion:
         *     Step 1: Remove anonymous class declaration and opening braces
         *     Step 2: Remove method name and replaced{ with -> Separator
         *     Step 3: Remove closing braces } for method and anonymous class
         *     Step 4: Remove semicolon after the statement unless it is a method block
         */
        Thread t2 = new Thread(() -> System.out.println("Thread 2"));

        t1.start();
        t2.start();
    }
}

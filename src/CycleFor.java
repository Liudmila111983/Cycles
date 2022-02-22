public class CycleFor {
    public static void main(String[] args) {
        //Поднимаемся по ступенькам с 1-й по 9-ю
        for (int i = 1; i<=9; i++)
            System.out.println(i);

        //for (;;)
            System.out.println("hi");

            //for (;true;)
        System.out.println("hi");

        //for (;false;)
            System.out.println("hi");

        for (int i=1; i>1; i++)
            System.out.println(i);

        for (int i=1; i<=9; i++, i++) {
            System.out.println(i);
            i++;
        }

    }
}

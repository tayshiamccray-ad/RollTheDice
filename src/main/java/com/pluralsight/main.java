package com.pluralsight;

public class main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.roll());

        int roll1 = 0;
        int roll2 = 0;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i < 100; i ++ ) {

            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;
            System.out.println("Roll" + i + ": " + roll1 + " - " + roll2 + "Sum: " + sum);
            System.out.printf("Roll %d: %d - %d Sum: %d\n", i, roll1, roll2, sum);

            switch (sum){
                case 2:
                    twoCounter++;
                    break;

                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;

                case 7:
                    sevenCounter++;
                    break;

            }

            if (sum == 2) ;
            {
                twoCounter++;
            } else if (sum == 4) ;
            {
                fourCounter++;
            } else if (sum == 6) ;
            {
                sixCounter++;
            } else if (sum == 7) ;
            sevenCounter++;{






            }

        }

    }


}

public class Main {
    public static void main(String[] args) {
        String dw1 = "\nMonday", dw2 = "\nTuesday", dw3 = "\nWednesday", dw4 = "\nThursday", dw5 = "\nFriday", dw6 = "\nSaturday", dw7 = "\nSunday";
        int rng = (int) (Math.random()* 8);
        switch (rng) {
            case 1:
                String dw1f = rng + dw1;
                System.out.println(dw1f);
                break;
            case 2:
                String dw2f = rng + dw2;
                System.out.println(dw2f);
                break;
            case 3:
                String dw3f = rng + dw3;
                System.out.println(dw3f);
                break;
            case 4:
                String dw4f = rng + dw4;
                System.out.println(dw4f);
                break;
            case 5:
                String dw5f = rng + dw5;
                System.out.println(dw5f);
                break;
            case 6:
                String dw6f = rng + dw6;
                System.out.println(dw6f);
                break;
            case 7:
                String dw7f = rng + dw7;
                System.out.println(dw7f);
                break;
            default:
                System.out.println("what even day it is")
        }

    }
}

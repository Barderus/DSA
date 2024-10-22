package DS_Arrays.Implementation;

public class Question4 {

    public static int question4(int x, int y) {
        if (x == y)
            return 0;
        else
            return question4(x - 1, y) + 1;
    }

    public static void main(String[] args) {
        int result = question4(8, 3);
        System.out.println(result);
    }

    }

public class Main {
    static String star = "*";
    static String blank = " ";

    static void createBox (int height, int width){
        for(int i = 0; i < width; i++){
            System.out.printf(star);
        }
        System.out.printf("\n");

        for (int i = 0; i < height; i++){
            System.out.printf(star);
            System.out.printf(blank.repeat(width-2));
            System.out.printf(star);
            System.out.printf("\n");
        }
        for(int i = 0; i < width; i++){
            System.out.printf(star);
        }
        System.out.printf("\n");
    }
    static void createOval (int height, int width){
        System.out.printf(blank.repeat(2));
        for (int i = 0; i < width; i++){
            System.out.printf(star);
        }
        System.out.printf("\n");
        System.out.printf(blank);
        System.out.printf(star);
        System.out.printf(blank.repeat(width));
        System.out.printf(star);
        System.out.printf("\n");

        for (int i = 0; i < height; i++){
            System.out.printf(star);
            System.out.printf(blank.repeat(width+2));
            System.out.printf(star);
            System.out.printf("\n");
        }
        System.out.printf(blank);
        System.out.printf(star);
        System.out.printf(blank.repeat(width));
        System.out.printf(star);
        System.out.printf("\n");

        System.out.printf(blank.repeat(2));
        for (int i = 0; i < width; i++){
            System.out.printf(star);
        }
        System.out.printf("\n");
    }
    static void createArrow (int height, int width){
        for (int i = 0; i <  (width+1)/2; i++){
            System.out.printf(blank.repeat(width - i));
            System.out.printf(star.repeat(i+1+i));
            System.out.printf("\n");
        }
        for (int i = 0; i < (height-(width+1)/2); i++){
            System.out.printf(blank.repeat(width));
            System.out.printf(star);
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    static void createDiamond (int height, int width){
        System.out.printf(blank.repeat(width/2+1)+star+"\n");
        for (int i = 0; i < (height-2)/2; i++){
            System.out.printf(blank.repeat(width/2 - i));
            System.out.printf(star + blank.repeat(2*i + 1) + star);
            System.out.printf("\n");
        }
        for (int i = 0; i < (height-2)/2; i++){
            System.out.printf(blank.repeat(width/4 + i));
            System.out.printf(star + blank.repeat(width/2 - i*2 + 1) + star);
            System.out.printf("\n");
        }
        System.out.printf(blank.repeat(width/2+1)+star+"\n");
    }

    public static void main(String[] args){
        createBox(5,5);
        createOval(5,5);
        createArrow(5,5);
        createDiamond(9,9);
    }
}

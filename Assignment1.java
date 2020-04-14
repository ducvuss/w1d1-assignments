public class Assignment1 {
    public static void main(String[] args) {
        // System.out.println("hello");
        System.out.println("1)");
        print1(1, 6, 1);
        System.out.println("\n2)");
        print1(5, 0, -1);
        System.out.println("\n3)");
        print2(0, 5, 1);
        System.out.println("\n4)");
        print2(4, -1, -1);
    }

    public static void print1(int start, int end, int increment) {
        
        for (int i = start; i != end; i = i + increment) {
            switch (i) {
                case 5:
                    for (int j = 0; j < 9; j++) {
                        System.out.print("-");
                    }
                    break;
            
                default:
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    break;
            }
            System.out.println("");
        }
    }
    
    public static void print2(int start, int end, int increment) {
        int chars = 10;
        
        for (int i = start; i != end; i = i + increment) {
            switch (i) {
                case 4:
                    for (int j = 0; j < 11; j++) {
                        System.out.print("-");
                    }
                    break;
                default:
                    int starStartPos = chars / 2 - i;
                    int starEndPos = chars / 2 + i;
                    for (int j = 0; j < chars; j++) {
                        if (j < starStartPos) {
                            System.out.print(" ");
                        } else if (j > starEndPos) {
                            break;
                        } else {
                            System.out.print("*");
                        }
                    }
                    break;
            }
            
            System.out.println("");
            
        }
    }

}

class MultiFor {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            } // end for y
            if (x == 1) {
                x++;
            } // end if
        } // end for x
    } // end method main
} // end class MultiFor
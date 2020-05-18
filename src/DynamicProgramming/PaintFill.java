package DynamicProgramming;

public class PaintFill {
    enum Color { red, black, blue, yellow, white}

    boolean paintFill(Color[][] screen, int r, int c, Color ncolor){
        if(screen[r][c] == ncolor){
            return false;
        }
        return paintFill(screen, r, c, screen[r][c], ncolor);
    }

    boolean paintFill(Color[][] screen, int r, int c, Color ocolor, Color ncolor){
        if(r < 0 || r >= screen.length || c < 0 || c >= screen.length){
            return false;
        }

        if(screen[r][c] == ocolor){
            screen[r][c] = ncolor;
            paintFill(screen, r + 1, c, ocolor, ncolor);
            paintFill(screen, r - 1, c, ocolor, ncolor);
            paintFill(screen, r, c + 1, ocolor, ncolor);
            paintFill(screen, r, c - 1, ocolor, ncolor);
        }
        return true;
    }
}

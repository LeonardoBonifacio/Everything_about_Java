package exercises;

public class DeMorgansLaws {
    public static void main(String[] args) {
        // !(CON && CON) IS EQUIVALENT (!CON || !CON)
        // !(CON || CON) IS EQUIVALEN (!CON && !CON)
        // Case 1: 
        // !(x < 4) && !(y >= 7)     ==    !(x < 4 || y >= 7)
        // Case 2:
        // !(a == b) || !(g != 4)    ==   !(a == b && g != 4)
        // Case3:
        // !((x <= 8) && (y > 4))    ==    (!(x <= 8) || !(y > 4))
        // Case 4:
        // !((i > 4) || (j <= 4))   ==    (!(i > 4)  && !( j <= 4))
    }
}

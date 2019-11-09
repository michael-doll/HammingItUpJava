package zipcode;

public class Hamming {
    String s;
    String s1;


    public Hamming(String s, String s1) throws IllegalArgumentException{
        this.s = s;
        this.s1 = s1;
        try {
            this.s = hamSafe(s);
            this.s1 = hamSafe(s1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int count = 0;
        String sSafe = hamSafe(s);
        String s1Safe = hamSafe(s1);

        for (int i = 0; i < sSafe.length(); i++) {
            if (sSafe.charAt(i) != s1Safe.charAt(i)) {
                count++;
            }
        }
        return count;
    }


    public String hamSafe(String s) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException();
        } else return s;
    }
}

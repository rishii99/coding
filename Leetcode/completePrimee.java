public class completePrimee {

    public boolean completePrimee(int num) {
        String s = "" + num;
        for (int i = 1; i <= s.length(); i++) {
            if (!p(Integer.parseInt(s.substring(0, i)))) return false;
            if (!p(Integer.parseInt(s.substring(s.length() - i)))) return false;
        }
        return true;
    }

    boolean p(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        completePrimee obj = new completePrimee();
        System.out.println(obj.completePrimee(233));  // Example test
    }
}

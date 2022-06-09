class DecimaltoOctal {
    int n = 2039;
    int oct = 0;

    public void decioct() {
        int a;

        if (n > 0) {
            a = n % 8;
            n /= 8;

            oct = (oct * 10) + a;
            decioct();
        } else
            System.out.println("Oct val is = " + oct);
    }
}
package DateClass;

public class DATE

{
    private int dt, mn, yr;
    static String mnth[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };

    DATE() {
        dt = mn = 1;
        yr = 1900;
    }

    DATE(int dt, int mn, int yr) {
        this.dt = dt;
        this.mn = mn;
        this.yr = yr;
    }

    DATE(String s) {
        s = s.replace(" ", "");
        int l = s.length();
        int i, dig = 0;
        char ch;
        for (i = dig; i < l; i++) {
            ch = s.charAt(i);
            if (ch == '/') {
                dt = Integer.parseInt(s.substring(dig, i));
                dig = i;
                break;
            }
        }
        for (i = dig; i < l; i++) {
            ch = s.charAt(i);
            if (ch == '/') {
                mn = Integer.parseInt(s.substring(dig, i));
                dig = i;
                break;
            }
        }
        for (i = dig; i < l; i++) {
            ch = s.charAt(i);
            if (ch == '/') {
                yr = Integer.parseInt(s.substring(dig, i));
                dig = i;
                break;
            }
        }
    }

    DATE(DATE ob) {
        this.dt = ob.dt;
        this.mn = ob.mn;
        this.yr = ob.yr;
        if (!validate())
            dt = mn = yr = 0;
    }

    public boolean validate() {
        int daysyr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int daysleapyr[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mn < 1 || mn > 12)
            return false;
        if (yr <= 0)
            return false;
        if (yr % 4 == 0) {
            if (dt > daysleapyr[mn - 1] || dt < 1)
                return false;
        } else {
            if (dt > daysyr[mn - 1] || dt < 1)
                return false;
        }
        return true;
    }

    public boolean leapchk() {
        if (yr % 4 == 0)
            return true;
        else
            return false;
    }

    public String monthName() {
        return mnth[mn + 1];
    }

    public void Dispdate() {
        String d = String.valueOf(dt) + "/" + String.valueOf(mn) + "/" + String.valueOf(yr);
        System.out.println(d);
    }

    public void longformat() {
        if (!validate())
            System.out.println("Invalid Date");
        else {
            String m = mnth[mn - 1];
            String e = "";
            if ((dt > 3 && dt < 21) || (dt > 23 && dt < 31))
                e = "th";
            else if (dt == 1 || dt == 21 || dt == 31)
                e = "st";
            else if (dt == 2 || dt == 22)
                e = "nd";
            else if (dt == 3 || dt == 23)
                e = "rd";
            String lf = dt + e + " " + m + "," + yr;
            System.out.println(lf);
        }
    }

    public boolean equals(DATE dtmp) {
        if (dtmp.dt == this.dt &&
                dtmp.mn == this.mn && dtmp.yr == this.yr)
            return true;
        else
            return false;
    }

    public int compareTo(DATE ob) {
        if (!validate())
            System.out.println("Invalid Date");
        else {
            if (this.yr < ob.yr)
                return -1;
            else if (this.yr > ob.yr)
                return 1;
            else {
                if (this.mn < ob.mn)
                    return -1;
                else if (this.mn > ob.mn)
                    return 1;
                else {
                    if (this.dt < ob.dt)
                        return -1;
                    else if (this.dt > ob.dt)
                        return 1;
                    else
                        return 0;
                }
            }
        }
        return 2;
    }

    DATE addDays(int n) {
        if (!this.validate()) {
            System.out.println("Invalid Date");
            return null;
        }
        DATE ob = new DATE(this);
        for (int i = 1; i <= n; i++) {
            ob.dt++;
            if (!ob.validate()) {
                ob.dt = 1;
                ob.mn++;
                if (ob.mn > 12) {
                    ob.mn = 1;
                    ob.yr++;
                }
            }
        }
        return ob;
    }

    DATE subdays(int n) {
        int daysyr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int daysleapyr[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (!this.validate()) {
            System.out.println("Invalid Date");
            return null;
        }
        DATE ob = new DATE(this);
        for (int i = 1; i <= n; i++) {
            ob.dt--;
            if (!ob.validate()) {
                ob.mn--;
                if (ob.mn < 1) {
                    ob.mn = 12;
                    ob.yr--;
                }
                if (ob.yr % 4 == 0)
                    ob.dt = daysleapyr[ob.mn - 1];
                else
                    ob.dt = daysyr[ob.mn - 1];
            }
        }
        return ob;
    }

    int diff(DATE dtt) {
        int d = 0;
        DATE ob1;
        DATE ob2;
        if (this.compareTo(dtt) == 0)
            return d;
        else if (this.compareTo(dtt) == -1) {
            ob1 = new DATE(this);
            ob2 = new DATE(dtt);
        } else {
            ob1 = new DATE(dtt);
            ob2 = new DATE(this);
        }
        if (!this.validate() || !dtt.validate())
            System.out.println("Invalid Date");
        while (!ob1.equals(ob2)) {
            ob1.dt++;
            if (!ob1.validate()) {
                ob1.dt = 1;
                ob1.mn++;
                if (ob1.mn > 12) {
                    ob1.mn = 1;
                    ob1.yr++;
                }
            }
            d++;
        }
        return d;
    }
}
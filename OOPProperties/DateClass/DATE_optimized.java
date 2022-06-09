// class DATE_optimized {
//     public int dt, mn, yr;

//     DATE() {
//         dt = 1;
//         mn = 1;
//         yr = 1900;
//     }

//     DATE(int dt, int mn, int yr) {
//         this.dt = dt;
//         this.mn = mn;
//         this.yr = yr;
//         if (validate() == false) // if given date is invalid
//         {
//             dt = 1;
//             mn = 1;
//             yr = 1900;
//         }
//     }

//     DATE(String s) {
//         this.dt = Integer.parseInt(s.substring(0, 2));
//         this.mn = Integer.parseInt(s.substring(3, 5));
//         this.yr = Integer.parseInt(s.substring(6));
//         if (validate() == false) // if given date is invalid
//         {
//             dt = 1;
//             mn = 1;
//             yr = 1900;
//         }
//     }

//     DATE(DATE dtmp) // this refers to class variable
//     {
//         this.dt = dtmp.dt;
//         this.mn = dtmp.mn;
//         this.yr = dtmp.yr;
//     }

//     boolean validate() {
//         if (mn > 12 || mn < 0 || dt < 0 || dt > 31 || (mn == 4 || mn == 6 || mn == 9 || mn == 11 && dt > 30))
//             return false;
//         else if (mn == 2 && leapchk() == true && dt > 29)
//             return false;
//         else if (mn == 2 && leapchk() == false && dt > 28)
//             return false;
//         else
//             return true;
//     }

//     boolean leapchk() {
//         if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0)
//             return true;
//         else
//             return false;
//     }

//     String monthName() {
//         String Month[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
//                 "October", "November", "December" };
//         return Month[mn];

//     }

//     void Dispdate() {
//         System.out.println("" + dt + "/" + mn + "/" + yr);
//     }

//     void longformat() {
//         System.out.print(dt);
//         if (dt == 1 || dt == 21 || dt == 31)
//             System.out.print("st ");
//         else if (dt == 2 || dt == 22)
//             System.out.print("nd ");
//         else if (dt == 3 || dt == 23)
//             System.out.print("rd ");
//         else
//             System.out.print("th ");
//         System.out.print(monthName());
//         System.out.println(" " + yr);
//     }

//     boolean equals(DATE ndt) {
//         if ((this.dt == ndt.dt) && (this.mn == ndt.mn) && (this.yr == ndt.yr))
//             return true;
//         else
//             return false;
//     }

//     int compareTo(DATE ndt) {
//         int ans = 0;
//         if (this.yr > ndt.yr)
//             ans = -1;
//         else if (this.yr < ndt.yr)
//             ans = 1;
//         else if (this.yr == ndt.yr) {
//             if (this.mn > ndt.mn)
//                 ans = -1;
//             else if (this.mn < this.mn)
//                 ans = 1;
//             else if (this.mn == ndt.mn) {
//                 if (this.dt > ndt.dt)
//                     ans = -1;
//                 else if (this.dt < ndt.dt)
//                     ans = 1;
//                 else
//                     ans = 0;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args)
//     {
//         DATE dt1 = new DATE(12,07,2002);
//         DATE dt2 = new DATE(25,07,2005);
//         if(dt1.leapchk()==false)
//             System.out.println(“It is not a leap year”);
//         else
//             System.out.println(“It is a leap year”);
//         System.out.println(dt1.monthName());
//         dt1.Dispdate();
//         dt2.longformat();
//         System.out.println(dt1.equals(dt2));
//         System.out.println(dt1.compareTo(dt2));
//     }
// }
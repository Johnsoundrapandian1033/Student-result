import java.util.Scanner;
public class School {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many number of students? : ");
        int n = scanner.nextInt();
        Student students[] = new Student[n];
        Address addresses[] = new Address[n];
        MarkSslc markSs[] =new MarkSslc[n];
        MarkHsc markHs[] = new MarkHsc[n];
        int si;
        String result = null;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("enter the Name : ");
            String qi = scanner.next();
            System.out.print("enter the Age : ");
            int r = scanner.nextInt();
            System.out.print("enter the RollNo : ");
            int t = scanner.nextInt();
            System.out.print("enter the Standard : ");

            boolean flag = false;
            do {
                si = scanner.nextInt();
                flag = false;
                if (si <= 10 && si > 0) {
                    boolean choice = false;

                    int ta, en, ma, sc, so;
                    do {
                        choice = false;
                        System.out.print("tamil : ");
                        ta = scanner.nextInt();
                        if (ta <= 100 && ta >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);


                    do {
                        choice = false;
                        System.out.print("english : ");
                        en = scanner.nextInt();
                        if (en <= 100 && en >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("mathamatics : ");
                        ma = scanner.nextInt();
                        if (ma <= 100 && ma >= 0);
                            else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("science : ");
                        sc = scanner.nextInt();
                        if (sc <= 100 && sc >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("socialScience : ");
                        so = scanner.nextInt();
                        if (so <= 100 && so >= 0) ;
                            else {
                            choice = true;
                        }
                    } while (choice);
                    if(ta < 35 || en < 35 || ma < 35 || sc < 35 || so < 35){
                        result = "--------FAIL-------";
                    }
                    else
                       result = "---------PASS-------";
                    
                    MarkSslc marks = new MarkSslc(ta, en, ma, sc, so);
                    markSs[i] = marks;
                }
            else if (si <= 12 && si >= 11) {
                    int ta, en, ma, ph, ch, bi;
                    boolean choice = false;

                    do {
                        choice = false;
                        System.out.print("tamil : ");
                        ta = scanner.nextInt();
                        if (ta <= 100 && ta >= 0);
                         else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("english : ");
                        en = scanner.nextInt();
                        if (en <= 100 && en >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("mathamatics : ");
                        ma = scanner.nextInt();
                        if (ma <= 100 && ma >= 0) ;
                            else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("physics : ");
                        ph = scanner.nextInt();
                        if (ph <= 100 && ph >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("chemistry : ");
                        ch = scanner.nextInt();
                        if (ch <= 100 && ch >= 0) ;
                        else {
                            choice = true;
                        }
                    } while (choice);

                    do {
                        choice = false;
                        System.out.print("biology : ");
                        bi = scanner.nextInt();
                        if (bi <= 100 && bi >= 0) ;
                         else {
                            choice = true;
                        }
                    } while (choice);
                    if(ta < 35 || en < 35 || ma < 35 || ph < 35 || ch < 35 || bi < 35){
                        result = "--------FAIL-------";
                    }
                    else
                        result = "---------PASS-------";
                    MarkHsc markh = new MarkHsc(ta, en, ma, ph, ch, bi);
                    markHs[i] = markh;
                }
                else {
                    System.out.println("re-enter the  standard :");
                    flag = true;
                }
            }while(flag);
            Student student = new Student(qi, r,si,t);
            students[i] = student;
            System.out.println("students Address  ");
            System.out.print("enter the DoorNo : ");
            int k = scanner.nextInt();
            System.out.print("enter the Street : ");
            String li = scanner.next();
            String ex = scanner.nextLine();
            System.out.print("enter the City : ");
            String m = scanner.next();
            System.out.print("enter the District : ");
            String o = scanner.next();
            System.out.print("enter the Pin code : ");
            long p = scanner.nextLong();
            Address address = new Address(k,li,m,o,p);
            addresses[i] = address;

            System.out.println("\n");
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("------------------Student"+(i+1)+"------------------");
            Student student = students[i];
            Address address = addresses[i];
            MarkSslc marks = markSs[i];
            
            System.out.println(student.getStudent());
            System.out.println(address.getAddress());
            if(marks != null){
                System.out.println(marks.getSslc());
                System.out.print("student total Mark : ");
                System.out.println(marks.getSslcTotal());
                System.out.print("percentage :");
                System.out.println(marks.percentageSslc());
                System.out.println(result);
            }
            MarkHsc markh = markHs[i];
            if(markh != null){
                System.out.println(markh.getHsc());
                System.out.print("student total Mark : ");
                System.out.println(markh.getHscTotal());
                System.out.print("Engineering cutOff :");
                System.out.println(markh.engineeringCutOff());
                System.out.print("Medical cutOff :");
                System.out.println(markh.medicalCutOff());
                System.out.print("percentage :");
                System.out.println(markh.percentageHsc());
                System.out.println(result);
            }
            System.out.println("--------------------------------------------------\n\n");
        }
    }
}


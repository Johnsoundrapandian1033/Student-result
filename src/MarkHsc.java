

class MarkHsc {
    int tamil;
    int english;
    int mathamatics;
    int physics;
    int chemistry;
    int biology;


     MarkHsc(int a, int b, int c, int d, int e, int f) {
        tamil = a;
        english = b;
        mathamatics = c;
        physics = d;
        chemistry = e;
        biology = f;

    }

    public int mark(int ma){
         if(ma >= 0 && ma <= 100)
           return ma;
        return ma;
    }
    public int getHscTotal(){
         return tamil  + english + mathamatics + physics + chemistry + biology;
    }
    public String getHsc() {
        return "tamil :" + tamil + "\n english :" + english + "\nmathamatics :" + mathamatics + "\nphysics :" + physics + "\nchemistry :" + chemistry + "\nbiology :" + biology;
    }
    /*String result(int a){
        if(a >= 0 && a < 35){
            return FAIL;
        }
        else
            return PASS;
    }*/

    public double engineeringCutOff() {
        return mathamatics + (physics + chemistry) / 2;
    }

    public double medicalCutOff() {
        return biology + (physics + chemistry) / 2;
    }

    public double percentageHsc() {
        int sum = (tamil + english + mathamatics + physics + chemistry + biology) / 6;
        return sum;

    }
}

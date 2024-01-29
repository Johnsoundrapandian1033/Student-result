 class MarkSslc {
    int tamil ;
    int english;
    int mathamatics;
    int science;
    int socialScience;
     MarkSslc(int a, int b, int c, int d, int e) {
         tamil = a;
         english = b;
         mathamatics = c;
         science = d;
         socialScience = e;
     }
     //public String getResult(){

     public int getSslcTotal(){
         return tamil  + english + mathamatics + science + socialScience;
     }
        public String getSslc(){
            return "tamil  :"+ tamil + "\nenglish :" + english + "\nmathamatics :" + mathamatics +"\nscience :"+ science + "\n socialScience  :" + socialScience;
        }
       public double percentageSslc(){
            double sum = (tamil + english + mathamatics + science + socialScience)/5;
            return sum;
        }



 }

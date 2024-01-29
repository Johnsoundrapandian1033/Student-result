class Student{
    String name;
    int age;
    int std;
    int rollNo;
    // Mugavari mugavari;

    Student(String n, int b,int c,int d){
        name = n;
        age = b;
        std = c;
        rollNo = d;
        //mugavari = o;

    }
    public String getStudent(){
        return "name"+": " +name+ "\nage"+ ": " + age+"\nstandard"+": "+std+"\nrollNo" +": "+ rollNo ;
    }
}


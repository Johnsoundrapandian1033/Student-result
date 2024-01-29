class Address {
    int doorNo;
    String street;
    String city;
    String district;
    long pinCode;
    Address(int f , String g, String h,String i,long j){
        doorNo = f;
        street = g;
        city = h;
        district = i;
        pinCode = j;
    }
    public String getAddress(){
        return "doorNo" +": "+doorNo+"\nstreet" +": "+street+"\ncity" +": "+city+ "\ndistrict"+":" +district+"\npincode :"+pinCode;
    }
}


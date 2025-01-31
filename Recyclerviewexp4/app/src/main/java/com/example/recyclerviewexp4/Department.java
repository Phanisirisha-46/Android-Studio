package com.example.recyclerviewexp4;

public class Department {
    int dpic;
    String dname;
    String dseats;
    public Department(int dpic, String dname, String dseats) {
        this.dpic = dpic;
        this.dname = dname;
        this.dseats = dseats;
    }

    public String getDseats() {
        return dseats;
    }

    public void setDseats(String dseats) {
        this.dseats = dseats;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDpic() {
        return dpic;
    }

    public void setDpic(int dpic) {
        this.dpic = dpic;
    }


}

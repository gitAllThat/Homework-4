package edu.gcccd.csis;

/**
 * Created by ernest.perea on 9/14/2017.
 */
public class Company {
    protected String companyName;
    protected int employeeCount = 0;

    public Company(){}

    public Company(String cN, int eC){
        companyName = cN;
        employeeCount = eC;
    }

    public int getEmployeeCount(){
        return employeeCount;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String cN){
        companyName = cN;
    }

    @Override
    public boolean equals(Object obj) {
        return (((Company)obj).companyName.equals(companyName) && ((Company)obj).employeeCount == employeeCount);
    }
}


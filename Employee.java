package edu.gcccd.csis;

public class Employee{
    private String name;
    private String jobTitle;
    private String organization;
    private String birthday;

    public Employee(String n, String jT, String o, String bDay){
        name = n;
        jobTitle = jT;
        birthday = bDay;
        organization = o;
    }

    public String getName(){
        return name;
    }
    public String getOrganization(){
        return organization;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setOrganization(String org){
        organization = org;
    }

    @Override
    public boolean equals(Object obj){
        return(((Employee)obj).getOrganization().equals(organization) && ((Employee)obj).getName().equals(name) && ((Employee)obj).getBirthday().equals(birthday) && ((Employee)obj).getJobTitle().equals(jobTitle));
    }
}
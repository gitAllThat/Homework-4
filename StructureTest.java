package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, Organization they work for, Birthday
 *
 * As for the Organization that the Employee works for, you must also (at the very least) track this information:
 * Organization Name, Number of Employees
 *
 * The system muTst be able to properly compare any two employees against each other to determine,
 * if they are the same Person. his means that if you compared two People,
 * with the same Name, Birthday, and Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same Organization name are to be thought of as equal,
 * different names means different organizations.
 */
public class StructureTest {



    @Test
    public void employeeComplete() {
        //
        // check that an employee's attribute are complete and make sense.
        // assertTrue( employee is alive and company complies with child labor laws ...;
        //...

        Employee e1 = new Employee("Dave Davidson", "Pool Guy", "Microsoft", "08/20/2000");
        assertTrue(e1.getName().equals("Dave Davidson") && e1.getJobTitle().equals("Pool Guy") && e1.getOrganization().equals("Microsoft") && e1.getBirthday().equals("08/20/2000"));

    }
    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq() {
        Employee e1 = new Employee("Joe Bob","Janitor","Google","08/10/1983");
        Employee e2 = new Employee("Joe Bob","Janitor","Google","08/10/1983");
        // Create employee e1,
        // Create another employee e2 that matches the specific criteria for equality
        assertTrue(e1.equals(e2));

        // modify employee e2 (eg. by making her/him join the other company
        e2.setOrganization("Microsoft");
        assertNotEquals(e1, e2);

    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq() {
        Company c1 = new Company("Google", 5000);
        Company c2 = new Company("Google", 5000);
        // Create company c1,
        // Create company employee c2 that matches the specific criteria for equality
        assertTrue(c1.equals(c2));

        // modify company c2, i.e. change its name or create another company with a different name ..
        c2.setCompanyName("Microsoft");
        assertNotEquals(c1, c2);

    }

    @Test
    public void companyComplete() {
        Company c1 = new Company("Microsoft", 5000);
        assertTrue(c1.getCompanyName().equals("Microsoft") && c1.getEmployeeCount() == 5000);
    }
}
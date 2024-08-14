import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecuritySystem {
    //when working with collections or maps they must be initialized first
    private Collection<EmployeeID> mitarbeitern = new ArrayList<>();
    private Map<String, SecurityAccessLevel> securityAccessLevelMap= new HashMap<>();

    public void addEmployee(EmployeeID employee){
        mitarbeitern.add(employee);
        System.out.println("employee " + employee + " added!");
    }
    public boolean isEmployed(EmployeeID employee){
        return mitarbeitern.contains(employee);
    }
    public EmployeeID getEmployeeByUID(int UID){
        //for each employee check there UID, if its the same as the requested UID return this emplyee
        for (EmployeeID employee: mitarbeitern) {
            if (employee.getUID() == UID){
                return employee;
            }
        }
        //if no employee with this UID found return null
        System.out.println("employee not found");
        return null;
    }

    public void addArea(String areaname, SecurityAccessLevel accessLevel){
        securityAccessLevelMap.put(areaname, accessLevel);
        System.out.println("area added succesfully");
    }
    public void removeArea(String areaname){
        securityAccessLevelMap.remove(areaname);
        System.out.println("area removed succesfuly");
    }
    public boolean hasAccess(EmployeeID employee, String area){
        //ordinal makes elements of enume classses counted from 1 to n
        return employee.getAccessLevel().ordinal() >= securityAccessLevelMap.get(area).ordinal();
    }

}

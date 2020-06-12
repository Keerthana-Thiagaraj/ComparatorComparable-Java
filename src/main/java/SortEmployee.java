import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<Employee>();

        employeeList.add(new Employee(12,300,"ravi"));
        employeeList.add(new Employee(29,2000,"ram"));
        employeeList.add(new Employee(45,1500,"sam"));
        employeeList.add(new Employee(35,2000,"abi"));

        Comparator<Employee> comparator= new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {

                if(o1.getSalary()>o2.getSalary()){
                    return 1;
                }else{
                    return -1;
                }

            }
        };


        Collections.sort(employeeList,comparator);

        for(Employee list:employeeList){
            System.out.println(list);
        }
    }
}

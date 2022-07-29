package task.EmployeeDetails.employeeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import task.EmployeeDetails.Employee;

@RestController
public class EmployeeController {
    @GetMapping("/Employee")
    public Employee details()
    {
        return new Employee("Saurabh","Kure",24,15000);
    }

    @GetMapping("/EmployeeDetail")
        public Employee detailsRP(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName")
                                String lastName,@RequestParam(name="age") int age,@RequestParam(name = "salary")
                                int salary){
        return new Employee(firstName,lastName,age,salary);

        }


        @GetMapping("/EmployeePV/{firstName}/{lastName}/{age}/{salary}")
    public  Employee detailsPV(@PathVariable("Saurabh")String firstName,@PathVariable("Kure")String lastName,
                             @PathVariable("24")int age,@PathVariable("30000")int salary){
                return new Employee(firstName,lastName,age,salary);
        }


}

import java.util.*;

// Employee class represents an employee record
class Employee
{
    int id;
    String name;
    String department;

     // Constructor to initialize employee details
     Employee(int id,String name,String department)
      {
        this.id=id;
        this.name=name;
        this.department=department;
      }

    // Method to add a new employee
    static void addEmployees()
    {
        System.out.print("Enter Your ID : ");
        int id=sc.nextInt();
        sc.nextLine();// Consume newline character

        // Check if Employee ID already exists
        for(Employee e : employees)
        {
            if(e.id==id)
            {
                System.out.println("Employee ID Already Exist ");
                return;
            }
        }
        // Get employee name and department
        System.out.print("Enter Your Name : ");
        String name=sc.nextLine();
        System.out.print("Enter your Department : ");
        String dept=sc.nextLine();

        // Create and add new employee object to ArrayList
        employees.add(new Employee(id,name,dept));
        System.out.println("\nEmployee added successfully");
    }

     // Method to display all employees
    static void viewEmployees()
    {
        // Traverse ArrayList and display employee details
        for(Employee e:employees)
        {          
             System.out.println("=> "+e.id+" | "+e.name+" | "+e.department); 
        }
    }

    // Method to search employee using Employee ID
    static void searchEmployees()
    {
        System.out.print("Enter Employee ID : ");
        int id=sc.nextInt();

        // Search employee in ArrayList
        for(Employee e:employees)
        {
            if(e.id==id)
            {
                System.out.println("Employee Found :"+"Name :"+"["+e.name+"]"+" | "+"Department :"+"["+e.department+"]");
                return;
            }
        }
         // If no matching employee found
        System.out.println("Employee not found");
    
    }

    // Method to delete an employee
    static void deleteEmployees()
    {
        System.out.print("Enter Employee ID :");
        int id=sc.nextInt();
        sc.nextLine();

        // Search employee by ID
        for(Employee e:employees)
        {
            if(e.id==id)
            {
                // Remove employee from ArrayList
                employees.remove(e);
                System.out.println("Employee Removed Successfully");
                return;
            }
        }
        // Employee not found
        System.out.println("Employee not found");
    }

    // Method to update employee department
    static void updateDepartment()
    {
        System.out.print("Employee ID:");
        int id=sc.nextInt();
        sc.nextLine();

        // Search employee by ID
        for(Employee e:employees)
        {
            if(e.id==id)
            {
                // Get new department name
                System.out.print("Enter New Department :");
                e.department=sc.nextLine();
                System.out.println("\nDepartment updated successfully");
                return;
            }
        }
        // Employee not found
        System.out.println("Employee not found");
    }

    // ArrayList acts as in-memory storage for employees
    static ArrayList<Employee> employees=new ArrayList<>();

     // Scanner object for user input
        static Scanner sc=new Scanner(System.in);

       // Main method - Entry point of the program
        public static void main(String args[])
      {
        // Infinite loop to repeatedly display menu
        while(true)
        {
            System.out.print("\n********************");
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Department");
            System.out.println("6. Exit");
            System.out.println("********************");
            System.out.print("Enter Your Choice (1/2/3/4/5/6) : ");
            int choice=sc.nextInt();
            System.out.println("********************");
            
             // Perform operation based on user choice
            switch(choice)
            {
                case 1:
                    addEmployees();    // Add employee
                    break;
                case 2:
                    viewEmployees();    // View all employees
                    break;
                case 3:
                    searchEmployees();   // Search employee
                    break;
                case 4:
                    deleteEmployees();   // Delete employee
                    break;
                case 5:
                    updateDepartment();   // Update department
                    break;
                case 6:
                    System.exit(0);  // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice ");   // Handle invalid menu choice
            }
        }
      }
}
import java.util.Collection;

public class EmployeesManager {

  /**
   * Implement EmployeesManager to manage all employees of a company
   *
   */

  /**
   * Adds an Employee
   *
   * @param employee
   * @return
   */
  String addEmployee(Employee employee) {
    // TODO - implement this
    getDBConnection();
    stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
    ResultSet.CONCUR_READ_ONLY);
    sqlString =
    "INSERT INTO Employee VALUES (Employee_SEQ.nextval, '" +
    first_name + "','" +
    last_name + "','")";
    stmt.execute(sqlString);
    return "success";
  }

  /**
   * Finds an Employee
   *
   * @param employeeId
   * @return
   */
  Employee findEmployee(String employeeId) {
    // TODO - implement this
    try
    (PreparedStatement preparedStatement =
    connection.prepareStatement("SELECT First_Name, Last_Name FROM EMPLOYEE WHERE employeeId = ?")) {
    if(resultSet.next()) {
    returnValue.add(new Employee(resultSet));
    } else {
    throw new SQLException("No recrods found");
    } 
    catch (SQLException ex) {
    logger.log(Level.SEVERE, null, ex);
    throw ex;
    }
    }
    return Employee;
    return null;
  }

  /**
   * Find all Employee who are older than X years
   * @param years
   * @return
   */
  Collection<Employee> findEmployee(int years) {
    return null;
  }

  /**
   * Removes an employee
   *
   * @param employeeId
   * @return
   */
  boolean removeEmployee(String employeeId) {
    // TODO - implement this
    return false;
  }

  /**
   * Lists all Employees
   *
   * @return
   */
  Collection<Employee> listEmployees() {
    // TODO - implement this
    return null;
  }
}

class Employee {

  private int ageInYears;
  private int ageInMonths;
  private String birthDate;
  private String firstName;
  private String lastName;

  private String employeeId;

  public Employee(String fullName, String birthDate) {
    // TODO - implement this
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public int getAgeInMonths() {
    return ageInMonths;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getBirthDate() {
    return birthDate;
  }
}

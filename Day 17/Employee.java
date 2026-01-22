public class Employee<K,V> {
    private K empId;
    private V empName;

    Employee(K empId,V empName)
    {
        this.empId=empId;
        this.empName=empName;
    }
    public K getEmpId() {
        return empId;
    }
    public V getEmpName() {
        return empName;
    }
}

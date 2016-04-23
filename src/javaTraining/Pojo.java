/**
 * 
 */
package javaTraining;

/**
 * @author CG3
 *
 */
public class Pojo {
	private int id ;
    private String empName;
    private float empSalary;
    private boolean status;
	/**
	 * @param args
	 */
    
    Pojo(int id , String name , float salary , boolean status) {
    	this.id = id ;
    	this.empName = name ;
    	this.empSalary = salary ;
    	this.status = status ;
    	
    }
	public  void main(String[] args) {
		// TODO Auto-generated method stub
       
       
	}
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}

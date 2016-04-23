/**
 * 
 */
package javaTraining;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CG3
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pojo> emps= new ArrayList<Pojo>();
	       
	       emps.add(new Pojo(1,"pavan",15000,true));
	       emps.add(new Pojo(2,"kumar",15000,true));
	       emps.add(new Pojo(3,"prudhivi",15000,true));
	       
	       
	       
	       for (Pojo e:emps){
	    	   System.out.println("\nid :"+ e.getId()+"\nname: " +e.getEmpName()+"\nsalary:"+e.getEmpSalary()+"\nstatus :" +e.isStatus());
	    	   
	       }
	}

}

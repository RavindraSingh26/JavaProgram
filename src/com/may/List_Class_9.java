package com.may;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.EmployeeBean;

class CompleteList{
	
	public EmployeeBean getList(){
		
		EmployeeBean bean = new EmployeeBean();
		
		return bean;
	}
	
	public List<EmployeeBean> getEmpList(){
		
		List<EmployeeBean> bean = new ArrayList<EmployeeBean>();
		
		bean.add(new EmployeeBean("A", "DD", "FD", 123, 001, null));
		bean.add(new EmployeeBean("B", "DEWS", "SWEDD", 123, 001, null));
		bean.add(new EmployeeBean("C", "DGT", "KJUH", 123, 001, null));
		bean.add(new EmployeeBean("D", "SDEF", "FDS", 123, 001, null));
		bean.add(new EmployeeBean("E", "DSW", "DSW", 123, 001, null));
		
		Iterator itr = bean.iterator();
		while(itr.hasNext()){
			
			EmployeeBean obj = (EmployeeBean) itr.next();
			System.out.println("Employee Data : " + itr.toString());
		}
		
		
		for(EmployeeBean em : bean){
		
			System.out.println("Hello =" + em.toString());
		}
		return bean;
	}

}


public class List_Class_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "Applicable endosement : 258: It is hereby understood and agreed that the indemnity granted under this Policy does not extend to indemnify the Insured in respect of accidents arising employees while engaged in racing pace making or speed trials.#Applicable endorsement : 237: It is hereby understood and agreed that any work in connection with the erection fitting up or repair of plant or installations in generating stations, cinemas coilieries, factories, mines quarries, ships theaters music halls, public halls and on the roofs, of railway stations over 9 Metres in height is expressly excluded from the indemnity granted under this Policy.Location to be covered:-Plot No G 1946, Gate No 2, Road K, Kalawad Road, Gidc Metoda.#Medical Expenses shall be provided upto a period of 12 months from the date of Accident.";
		
		String[] strSplit = str.split("#");
		int count = 1;
				
		for(int i = 0; i < strSplit.length; i++){
			
			System.out.println(count + " " +  strSplit[i]);
			count++;
		}

	}

}

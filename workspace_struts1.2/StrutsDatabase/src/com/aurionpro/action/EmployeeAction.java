package com.aurionpro.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.aurionpro.model.EmployeeForm;
import com.aurionpro.util.DatabaseConnection;

public class EmployeeAction  extends DispatchAction{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rs;
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		EmployeeForm employeeForm=(EmployeeForm)form;
		con=DatabaseConnection.myConnection();
		pst=con.prepareStatement("insert into employee values(?,?,?)");
		pst.setInt(1, employeeForm.getId());
		pst.setString(2, employeeForm.getName());
		pst.setFloat(3, employeeForm.getSalary());
		int r=pst.executeUpdate();
		if(r==1){
			request.setAttribute("status", "Record Added");
		return mapping.findForward("success");
		}
		else{
			request.setAttribute("status", "Record Not Added");
		return mapping.findForward("failure");
		}
	}
	List<EmployeeForm> list1;
	EmployeeForm emp;
	public ActionForward showall(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		EmployeeForm employeeForm=(EmployeeForm)form;
		con=DatabaseConnection.myConnection();
		st=con.createStatement();
		rs=st.executeQuery("select * from employee");
		
		if(rs.next()){
			list1=new ArrayList<>();
			//rs.previous();
			emp=new EmployeeForm();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			list1.add(emp);
               emp=null;
			while(rs.next()){
				emp=new EmployeeForm();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				list1.add(emp);
			}
			request.setAttribute("status", "showall");
			request.setAttribute("emplist", list1);
			
			return mapping.findForward("success");
		}
		else
		{
			request.setAttribute("status", "No Record Available");
		return mapping.findForward("failure");
		}
	}
}

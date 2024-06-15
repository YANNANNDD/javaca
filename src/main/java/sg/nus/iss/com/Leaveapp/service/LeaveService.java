package sg.nus.iss.com.Leaveapp.service;

import java.time.LocalDate;
import java.util.List;

import sg.nus.iss.com.Leaveapp.model.Employee;
import sg.nus.iss.com.Leaveapp.model.Leave;
import sg.nus.iss.com.Leaveapp.model.LeaveStatus;
import sg.nus.iss.com.Leaveapp.model.LeaveType;

public interface LeaveService {
	
	Employee findEmployee(Long id);
	
	LocalDate findStartDate(Long id);
	
	LocalDate findEndDate(Long id);
	
	List<Employee> findEmployeesBetweenStartAndEndDate(LocalDate startDate, LocalDate endDate);
	
	String findReason(Long id);
	
	LeaveStatus findLeaveStatus(Long id);
	
	LeaveType findLeaveType(Long id);
	
	Long findIdByEmpId(Long empId);
	
	String findLeaveReasonsByEmpId(Long empId);
	
	LocalDate findLeaveAppStartDateByEmpId(Long empId);
	
	LocalDate findLeaveAppEndDateByEmpId(Long empId);
	
	LeaveStatus findLeaveappStatusByEmpId(Long empId);
	
	String findEmpNameByLeaveId(Long empId);
	
	String findEmpRoleByLeaveId(Long empId);
	
	void save(Leave leave);
	
	List<Leave> findLeavesFromEmployeeId(Long id);
	
}

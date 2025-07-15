package com.employee.ws.event;

import com.employee.ws.core.EmployeeEvent;
import com.employee.ws.entity.EmployeeEntity;

public class EmployeeEventMap {

	public static EmployeeEvent mapToEvent(EmployeeEntity newEmployee) {
	    EmployeeEvent event = new EmployeeEvent();
	    event.setEmployeeId(newEmployee.getEmployeeId());
	    event.setName(newEmployee.getName());
	    event.setUnit(newEmployee.getUnit());
	    event.setEmail(newEmployee.getEmail());
	    event.setPhone(newEmployee.getPhone());
	    return event;
	}

}

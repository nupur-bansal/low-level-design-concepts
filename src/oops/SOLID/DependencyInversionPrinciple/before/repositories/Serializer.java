package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface Serializer{
	public String serialize(Employee employee);
}
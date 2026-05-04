select (
	select DISTINCT salary
	from employee
	order by salary dec
	limit 1 offset 2
) as SecondHighestSalary; 
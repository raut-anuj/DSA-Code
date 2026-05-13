select (
	select DISTINCT amount
	from duty
	order by amount desc
	limit 1 offset 5
) as SecondHighestSalary;

dispite haveling th e same name of column we can use alias to give it a different name and use it in the main query.

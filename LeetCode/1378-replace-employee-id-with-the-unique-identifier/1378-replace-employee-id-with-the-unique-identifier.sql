# Write your MySQL query statement below
select uemp.unique_id, emp.name from Employees as emp
left join EmployeeUNI as uemp
on emp.id = uemp.id;
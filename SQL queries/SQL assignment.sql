-- Using mySQL dialect.

-- Solution for A)

SELECT em.name,  sup.name as supervisor, b.nbonus as bonus
FROM bonus b
JOIN employees em 
	on b.empid = em.empid
JOIN employees sup
	on em.supervisor = sup.empid
WHERE nbonus > 2000

-- Solution for B)

SELECT emp.name, emp.salary, sub.nbonus as bonus, sub.total_pay
FROM (
	SELECT em.name, max(em.salary + b.nbonus) as total_pay, em.location, em.empid, b.nbonus, em.salary
	FROM employees em
	JOIN bonus b
		on em.empid = b.empid	
	GROUP BY em.location
    ) as sub
JOIN employees emp
	ON sub.location = emp.location
    AND sub.total_pay = emp.salary + sub.nbonus
    
-- Solution for C)
UPDATE employees em
JOIN new_supervisor nw
	ON nw.empid = em.empid
SET em.supervisor = nw.supervisor

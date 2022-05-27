# Write your MySQL query statement below

select result.name, result.balance from (
select name, sum(amount) as balance
from users u
inner join transactions t
on u.account = t.account
group by u.account
) result
where result.balance > 10000;
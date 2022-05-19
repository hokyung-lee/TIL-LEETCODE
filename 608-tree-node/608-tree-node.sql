# Write your MySQL query statement below
select t1.id,
    case when t1.p_id is null then 'Root'
         when (select count(*) from tree t2 where t2.p_id=t1.id) = 0 then 'Leaf'
         else 'Inner'
    end as type
from tree t1;
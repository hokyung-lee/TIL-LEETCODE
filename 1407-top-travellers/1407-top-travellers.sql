# Write your MySQL query statement below
SELECT u.name as name, ifnull(sum(r.distance),0) as travelled_distance
FROM Users u
LEFT JOIN Rides r
on u.id = r.user_id
group by u.id
order by sum(r.distance) desc, u.name asc;
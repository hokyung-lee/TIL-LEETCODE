# Write your MySQL query statement below
UPDATE Salary 
SET sex = CASE WHEN substr(sex, 1,1)='m' THEN 'f' ELSE 'm'
END

# Write your MySQL query statement below
select temp.stock_name as stock_name, (temp.sell_sum-temp.buy_sum) as capital_gain_loss from (
select stock_name, 
sum(case when operation='Buy' then price else 0 end) as buy_sum,
sum(case when operation='Sell' then price else 0 end) as sell_sum
from stocks
group by stock_name
) temp
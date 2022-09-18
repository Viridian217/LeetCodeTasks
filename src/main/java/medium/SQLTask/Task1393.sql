# Write your MySQL query statement below
SELECT DISTINCT stock_name, (
        (SELECT SUM(price)
         FROM Stocks k2
         WHERE operation = 'Sell'
           AND k1.stock_name = k2.stock_name) -
        (SELECT SUM(price)
         FROM Stocks k3
         WHERE operation = 'Buy'
           AND k1.stock_name = k3.stock_name)
    )
    AS capital_gain_loss
FROM Stocks k1
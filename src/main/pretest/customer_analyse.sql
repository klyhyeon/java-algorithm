SELECT c.name,
       SUM(o.amount) AS total_amount
FROM orders o
         JOIN customers c ON o.customer_id = c.customer_id
WHERE o.order_date >= '2026-09-01'
  AND o.order_date < '2026-10-01'
GROUP BY o.customer_id
HAVING SUM(o.amount) >= (SELECT AVG(sub_total_amount)
                         FROM (SELECT customer_id, SUM(amount) as sub_total_amount
                               FROM orders
                               WHERE order_date >= '2026-09-01'
                                 AND order_date < '2026-10-01'
                               GROUP BY customer_id) so)
ORDER BY total_amount DESC, c.customer_id;


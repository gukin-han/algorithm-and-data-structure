WITH RECURSIVE cte AS (
  SELECT id, parent_id, 0 AS depth 
  FROM ecoli_data 
  WHERE parent_id IS NULL

  UNION ALL

  SELECT e.id, e.parent_id, c.depth + 1 
  FROM ecoli_data e
  JOIN cte c ON e.parent_id = c.id
  WHERE c.depth <= 2
)

SELECT id FROM cte where depth = 2 order by id asc;

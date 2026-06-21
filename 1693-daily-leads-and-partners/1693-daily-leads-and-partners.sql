-- SELECT
--     date_id,
--     make_name,
--     COUNT(DISTINCT lead_id) AS unique_leads,
--     COUNT(DISTINCT partner_id) AS unique_partners
-- FROM DailySales
-- GROUP BY date_id, make_name;

SELECT date_id,
       make_name,
       COUNT(DISTINCT lead_id) as unique_leads,
       COUNT(DISTINCT partner_id) as unique_partners
from DailySales
GROUP BY date_id, make_name;
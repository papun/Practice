SELECT * FROM (SELECT ndc AS "NDC", product_description AS "Product_description", prod_size AS "Prod_Size", TO_CHAR (intro_date, 'dd-MON-yy') AS "intro_date", TO_CHAR (expire_date, 'dd-MON-yy') AS "expire_date",  price_type AS "price_type", TO_CHAR (price, '09990.999999') AS "price",  TO_CHAR (effective_date, 'dd-MON-yy') AS "effective_date", pname_desc AS "pname_desc" FROM v_bms_reacts_wlp wlp  WHERE 1 = 1   AND TRUNC (wlp.effective_date)  BETWEEN ADD_MONTHS (TRUNC (TO_DATE (?, 'mm/dd/yyyy'),'mon' ),  -1 ) AND TRUNC (TO_DATE (?, 'mm/dd/yyyy'), 'mon') - 1 UNION SELECT ndc AS "NDC", product_description AS "Product_description", prod_size AS "Prod_Size", TO_CHAR (intro_date, 'dd-MON-yy') AS "intro_date", TO_CHAR (expire_date, 'dd-MON-yy') AS "expire_date", price_type AS "price_type", TO_CHAR (price, '09990.999999') AS "price",  TO_CHAR (effective_date, 'dd-MON-yy') AS "effective_date", pname_desc AS "pname_desc"  FROM   v_bms_reacts_wlp wlp,  ( SELECT sku, MAX ( TO_CHAR ( date_updated, 'YYYYMM' ) ) updated_month,COUNT ( DISTINCT NVL ( shelf_life_exp_date, SYSDATE ) ) AS value_ct FROM (SELECT * FROM   mn_item_ver  WHERE  1=1 AND TO_CHAR ( date_updated, 'YYYYMM' ) = TO_CHAR ( ADD_MONTHS (TRUNC (TO_DATE (?, 'mm/dd/yyyy'), 'mon' ), -1 ), 'YYYYMM' ) UNION select it.* from mn_item_ver it, (SELECT sku,max(date_updated) as date_updated FROM   mn_item_ver   WHERE  1=1  AND TO_CHAR ( date_updated, 'YYYYMM' ) < TO_CHAR ( ADD_MONTHS ( TRUNC ( TO_DATE ( ?, 'mm/dd/yyyy' ), 'mon' ), -1 ), 'YYYYMM' )  group by sku)a  WHERE a.date_updated = it.date_updated  and a.sku = it.sku  )   GROUP BY sku  ) last_lot  WHERE 1 = 1   AND   wlp.ndc   = last_lot.sku   AND   last_lot.value_ct > 1  AND   TO_CHAR ( wlp.effective_date, 'YYYYMM' ) != last_lot.updated_month   AND   ( wlp.ndc, wlp.effective_date ) IN ( SELECT ndc, MAX ( effective_date )  FROM   v_bms_reacts_wlp v   WHERE  1 = 1 AND    v.ndc = last_lot.sku  AND    last_lot.updated_month BETWEEN TO_CHAR ( v.effective_date, 'YYYYMM' ) AND TO_CHAR ( v.end_date, 'YYYYMM' ) GROUP BY v.ndc )   UNION  SELECT ndc AS "NDC", product_description AS "Product_description",   prod_size AS "Prod_Size",   TO_CHAR (intro_date, 'dd-MON-yy') AS "intro_date",   TO_CHAR (expire_date, 'dd-MON-yy') AS "expire_date",   price_type AS "price_type",   TO_CHAR (price, '09990.999999') AS "price", TO_CHAR (effective_date, 'dd-MON-yy') AS "effective_date",  pname_desc AS "pname_desc" FROM v_bms_reacts_wap wap    WHERE TRUNC (wap.effective_date) =  ADD_MONTHS (TRUNC (TO_DATE (?, 'mm/dd/yyyy'), 'mon'), -3)) pricinginfo ORDER BY pricinginfo."NDC", pricinginfo."price_type"
use myshop;

drop procedure if exists updatePrice;
DELIMITER $$
CREATE function updatePrice(item_code varchar(25), item_price int) returns int
BEGIN
declare price int;
declare concession_price int;
UPDATE item
   if item_price < 10 then;  
   SET concession_price = item_price;
   elseif item_price >= 10 and item_price <= 100 then;
   set price = item_price * 0.1;
   set concession_price = item_price - price;
   else
   set price = item_price * 0.2;
   set concession_price = item_price - price;
   WHERE item_code = item_code;
   end if;
END$$ 
DELIMITER ;

/*
CREATE FUNCTION SimpleCompare(n INT, m INT)
  RETURNS VARCHAR(20)

  BEGIN
    DECLARE s VARCHAR(20);

    IF n > m THEN SET s = '>';
    ELSEIF n = m THEN SET s = '=';
    ELSE SET s = '<';
    END IF;

    SET s = CONCAT(n, ' ', s, ' ', m);

    RETURN s;
  END //

DELIMITER ;
*/
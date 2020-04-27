#
# TABLE STRUCTURE FOR: Addresses
#

DROP TABLE IF EXISTS `Addresses`;

CREATE TABLE `Addresses` (
  `address_id` int(9) unsigned NOT NULL AUTO_INCREMENT,
  `line_1` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `line_2` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `line_3` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `state` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `pin_code` int(9) unsigned NOT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



INSERT INTO `Addresses` (`address_id`, `line_1`, `line_2`, `line_3`, `city`, `state`, `country`, `pin_code`) VALUES (2, 'Apt. 149', '910', 'Glens', 'Blanchechester', 'RhodeIsland', 'Montserrat', 56018);




Insert INTO Customers ( `customer_username`, `customer_password`, `customer_firstname`,`customer_lastname`, `customer_phone`, `customer_email` ) values ( 'nam', '7',  'Raymundo',' sharma', '3126486861', 'lyric.larson@example.net');

INSERT INTO `Addresses` (`address_id`, `line_1`, `line_2`, `line_3`, `city`, `state`, `country`, `pin_code`, `customer_id`) VALUES (1, 'Suite 562', '1171', 'Shore', 'North Valliemouth', 'Missouri', 'Cuba', 67066,1);


Insert INTO Customers ( `customer_username`, `customer_password`, `customer_firstname`,`customer_lastname`, `customer_phone`, `customer_email`  )values  ('deleniti', '9', 'Selina','gupta', '9901004502', 'wyman.ines@example.org')


Insert INTO Employees( `employee_username`, `employee_password`, `employee_firstname`,`employee_lastname`, `employee_phone`, `employee_email` ) values ( 'ut', '7',  'utkarsh',' gupta', '3126486861', 'lyric.larson@example.net');


insert into delivery_status values (2,3,'2018-11-10','Delivered');

Select Packages.package_id, `package_type`, `package_delivery_type`,`Delivery_status_time`,`Delivery_status_description` from  Packages, Delivery_Status where Packages.package_id = Delivery_Status.package_id and customer_id = 1 group by Delivery_Status.package_id;
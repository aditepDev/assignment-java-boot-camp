-- MEMBER
INSERT INTO MEMBER (MEMBER_ID,MEMBER_ADDRESS,MEMBER_NAME,MEMBER_TEL) VALUES (1,'93 m.3 Muang Udonthani 41000','Aditep Campira','080-1953293');
-- MEMBER WALLET
INSERT INTO MEMBER_WALLET (MEMBER_WALLET_ID,WALLET,MEMBER_ID) VALUES (1,5000.0,1);

-- PRODUCT & PRODUCT IMAGE
INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (1,'Canagan คานาแกน อาหารแมว สูตร ไก่ ฟรีเรนจ์ ขนาด 1.5kg ',
'คานาแกน ฟรี รัน ปลา อาหารลูกแมว และแมวโต เพื่อสุขภาพ ลดการเป็นนิ่ว ลดความเครียด',845.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (1,'image_canagan_chicken_1.jpg',1);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (2,'image_canagan_chicken_2.jpg',1);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (3,'image_canagan_chicken_3.jpg',1);


INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (2,'Canagan fish 1.5kg','คานาแกน ฟรี รัน ปลา อาหารลูกแมว และแมวโต เพื่อสุขภาพ ลดการเป็นนิ่ว ลดความเครียด',845.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (4,'image_canagan_fish_1.jpg',2);


INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (3,'Canagan Free-Run Chicken/Scottish Salmon 12kg','อาหารเกรด 6 ดาว Holistic/Grain-Free อาหารที่ยอดเยี่ยมจากประเทศอังกฤษ',3590.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (5,'image_canagan_scottish_1.jpg',3);


INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (4,'Kaniva (คานิว่า) อาหารแมวชนิดเม็ด -สูตรเนื้อไก่ ปลาทูน่า และข้าว 10kg','❌ ไม่มีส่วนผสมของ ข้าวโพด กลูเตน ✅ มีส่วนผสมของน้ำมันปลาแซลมอน (Omega-3) ✅ มีส่วนผสมของน้ำมันพริมโรส (Omega-6) ✅ โซเดียมต่ำ รับประกันไม่เค็ม ✅ โปรตีน 30% ไขมัน 17% ✅ เหมาะสำหรับลูกแมว และแมวโต',1290.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (6,'image_kaniva_fish_1.jpg',4);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (5,'FRISKIES Seafood & Surfin Turfin ฟริสกี้ส์ อาหารแมว อาหารเม็ด สำหรับแมวโต รสซีฟู้ด และ รสรวมมิตรปลาทะเล 17 กก.','สูตรอาหารหลากหลายเพื่อแมวทุกช่วงวัย อาหารแมวฟริสกี้ส์ เซิร์ฟฟิ่ง แอนด์ เทิร์ฟฟิ่ง',1119.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (7,'image_friskies_seafood_1.jpg',5);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (6,'Royal Canin Urinary 2kg','อาหารแมว สูตรป้องกันการเกิดโรคนิ่ว ขนาด 2 กิโลกรัม',679.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (8,'image_royal_canin_urinary_1.jpg',6);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (7,'Nekko Love Mix 3kg','อาหารแมว เน็กโกะ เลิฟมิกซ์ 3 กิโลกรัม',414.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (9,'image_nekko_love_mix_1.jpg',7);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (8,'Taste of the Wild Rocky Mountain Feline 5lb(2.27kg)','สูตรเนื้อกวางและแซลมอนรมควัน',1130.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (10,'image_taste_rocky_1.jpg',8);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (9,'Origen SixFish','ขนมแมว อาหารแมวเกรดพรีเมี่ยม Kitten ขนาด 340g',245.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (11,'image_origen_six_fish_1.jpg',9);

INSERT INTO PRODUCT (PRODUCT_ID,PRODUCT_NAME, PRODUCT_DETAIL,PRODUCT_PRICE) VALUES (10,'Cat&Kitten Orijen 1.8Kg','อาหารแมวเกรดพรีเมี่ยม Kitten ขนาด 1.8Kg',414.0);
INSERT INTO PRODUCT_IMAGE (PRODUCT_IMAGE_ID, PRODUCT_IMAGE,PRODUCT_ID) VALUES (12,'image_cat_kitten_orijen.jpg',10);